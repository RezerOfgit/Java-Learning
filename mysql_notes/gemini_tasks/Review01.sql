-- Review01: 身份验证的致命暗坑
--
-- 场景：你的同学也去装了最新的 MySQL 8.0，但是他用老版本的 SQLyog 怎么都连不上，
-- 总是报错 Authentication plugin cannot be loaded。

-- 问题：请问他是在安装的哪一步踩坑了？底层的原因是什么？（提示：关于密码加密方式）

-- 错误步骤：在安装 MySQL 8.0 的最后一步，未选择下面那个 "Use Legacy Authentication Method"（使用传统加密方式），这样就能完美兼容所有老工具了！
-- 原因：很多老版本的图形化连接工具（比如视频里的老版 SQLyog 或老版 Navicat）会连不上 8.0 的数据库，报错 Authentication plugin cannot be loaded。

