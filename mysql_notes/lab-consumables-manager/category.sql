-- 创建耗材分类表
CREATE TABLE `category` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` VARCHAR(50) NOT NULL COMMENT '分类名称',
  `sort` INT DEFAULT 0 COMMENT '排序权重',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='耗材分类表';

-- 插入真实的分类数据
INSERT INTO `category` (`id`, `name`, `sort`) VALUES
(1, '万级洁净室防护用品', 10),
(2, 'PI中试线专用原料', 20),
(3, '锂电池研发高危试剂', 30);

SELECT * FROM CATEGORY C ;