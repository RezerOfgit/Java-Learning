@Autowired
private RedissonClient redisson;

public void deductStockWithLock(Long materialId, int quantity) {
    String lockKey = "lock:material:" + materialId;
    RLock lock = redisson.getLock(lockKey);

    try {
        // 尝试加锁：最多等 5 秒，持有锁 30 秒后自动释放
        boolean acquired = lock.tryLock(5, 30, TimeUnit.SECONDS);
        if (!acquired) {
            throw new BusinessException("系统繁忙，请稍后重试");
        }

        // 执行业务逻辑
        Material material = materialMapper.selectById(materialId);
        if (material.getStock() < quantity) {
            throw new BusinessException("库存不足");
        }
        material.setStock(material.getStock() - quantity);
        materialMapper.updateById(material);

    } catch (InterruptedException e) {
        throw new BusinessException("加锁异常");
    } finally {
        if (lock.isHeldByCurrentThread()) {
            lock.unlock();
        }
    }
}