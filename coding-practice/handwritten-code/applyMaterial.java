// DCP 防超卖流程

/*
一扣：Redis.decrement → 判断 <0 则回滚
二落：MySQL 乐观锁（或条件更新）→ 判断 rows=0 则回滚 Redis
三记录：插入领用流水，触发后续
口诀：“先扣 Redis 防刷，再落 DB 定乾坤，失败必须回滚。”

用户请求
  │
  ▼
Redis.decrement(key, quantity)
  │
  ├─ 返回 < 0 → 补偿 Redis → 拒绝（库存不足）
  │
  ▼ 返回 >= 0（预扣成功）
  │
  ├──[单品]──→ SELECT → 应用层计算 → UPDATE WHERE version=?
  │                                │
  │                          更新 0 行 → 补偿 Redis → 拒绝（乐观锁冲突）
  │                          更新 1 行 → INSERT 记录 → 触发 AI 风控 → 成功
  │
  └──[批量]──→ UPDATE stock=stock-N WHERE stock>=N
                                  │
                          更新 0 行 → 补偿 Redis → 拒绝（库存不足）
                          更新 1 行 → INSERT 记录 → 触发 AI 批量风控 → 成功
 */

// 单品领用核心逻辑
public void applyMaterial(ApplyDTO dto) {
	String redisKey = PREFIX + dto.getMaterialId();

	// 1. Redis 预扣
	Long remain = redisTemplate.opsForValue().decrement(redisKey, dto.getQuantity());
	if (remain == null) throw new BusinessException("缓存未命中");
	if (remain < 0) {
		redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
		throw new BusinessException("库存不足");
	}

	// 2. MySQL 乐观锁落盘
	Material material = materialMapper.selectById(dto.getMaterialId());
	material.setStock(material.getStock() - dto.getQuantity());
	int rows = materialMapper.updateById(material); // WHERE version = ?
	if (rows == 0) {
		redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
		throw new BusinessException("并发冲突，请重试");
	}

	// 3. 插入记录 + 触发风控
	// ...
}

// 批量领用核心逻辑
// 预扣部分同上，MySQL 部分替换为:
int rows = materialMapper.deductStock(item.getMaterialId(), item.getQuantity());
if (rows == 0) throw new BusinessException("库存不足");

// deductStock: UPDATE material SET stock=stock-N WHERE id=? AND stock>=N

/*
这套方案的核心是 Redis 预扣 + MySQL 兜底 + 失败补偿。
用户请求进来后，先对 Redis 中对应物资的库存进行原子递减。如果剩余库存小于 0，
马上补偿加回去，并抛出库存不足异常。这一步利用了 Redis 的高性能和原子性，
拦住绝大部分无效请求。
预扣成功后进入 DB 精准扣减。对于单品领用，我采用乐观锁，先 SELECT 当前库存和
版本号，在应用层计算新库存，然后执行带版本条件的 UPDATE。如果影响行数为 0 说明
版本被修改，触发了并发冲突，就要补偿 Redis 并拒绝请求。
对于批量领用，为了性能，我直接执行 UPDATE stock = stock - N WHERE stock >= N，
在 SQL 层面保证库存不被扣成负数。同样，如果更新行数为 0，就回滚 Redis。
DB 更新成功后，插入领用记录、触发风控，整个流程结束。
这个设计在正常流量下能有效防超卖，同时通过补偿机制保证 Redis 与 DB 的最终一致。
极端宕机情况可以通过定时对账或领用超时释放来处理。
 */