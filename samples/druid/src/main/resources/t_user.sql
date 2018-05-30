CREATE TABLE `t_user` (
 `t_id` bigint(9) NOT NULL AUTO_INCREMENT,
 `t_name` varchar(50) DEFAULT NULL,
 `t_age` int(3) DEFAULT NULL,
 `t_address` varchar(90) DEFAULT NULL,
 PRIMARY KEY (`t_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;