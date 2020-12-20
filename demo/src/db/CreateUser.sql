CREATE TABLE
    USER
    (
        id INT NOT NULL AUTO_INCREMENT,
        username VARCHAR(32) NOT NULL COMMENT '用户名称',
        birthday DATETIME COMMENT '生日',
        sex CHAR(1) COMMENT '性别',
        address VARCHAR(256) COMMENT '地址',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;