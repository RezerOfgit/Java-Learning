-- 这里在默认情况下，rezero 用户只能看到一个默认的系统数据库
SELECT * FROM NEWS;

INSERT INTO news VALUES (200, '上海新闻');
-- 能否修改，能否delete
UPDATE NEWS SET CONTENT = '广州新闻'
		WHERE id = 100;