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
    int rows = materialMapper.updateById(material); // WHERE version=?
    if (rows == 0) {
        redisTemplate.opsForValue().increment(redisKey, dto.getQuantity());
        throw new BusinessException("并发冲突，请重试");
    }

    // 3. 插入记录 + 触发风控
}