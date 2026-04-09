USE `lab_consumables_db`;

CREATE TABLE IF NOT EXISTS `material` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `category_id` BIGINT NOT NULL COMMENT '所属分类ID',
  `name` VARCHAR(100) NOT NULL COMMENT '耗材名称',
  `specification` VARCHAR(50) COMMENT '规格型号',
  `unit` VARCHAR(20) NOT NULL COMMENT '计量单位',
  `stock` INT NOT NULL DEFAULT 0 COMMENT '当前库存量',
  `danger_level` INT NOT NULL DEFAULT 0 COMMENT '危险等级: 0-普通, 1-低危, 2-高危, 3-致命',
  `storage_condition` VARCHAR(100) COMMENT '存储条件',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `idx_category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='耗材详情表';

-- 预插入几条硬核数据，方便等下直接测试查询接口
INSERT INTO `material` (`category_id`, `name`, `specification`, `unit`, `stock`, `danger_level`, `storage_condition`) VALUES
(1, '丁腈无尘手套', '9寸-麻面-M码', '箱', 120, 0, '常温避光'),
(2, '均苯四甲酸二酐 (PMDA)', '纯度≥99.5%', 'kg', 50, 1, '密封防潮'),
(3, '氢氟酸 (HF)', '49%-500ml/瓶', '瓶', 30, 3, '专用防腐柜，双人双锁');