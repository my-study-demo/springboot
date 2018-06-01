CREATE TABLE `roles` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(255) DEFAULT NULL,
  `r_flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `users` (
  `u_int` int(11) NOT NULL AUTO_INCREMENT,
  `u_username` varchar(50) DEFAULT NULL,
  `u_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`u_int`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_roles` (
  `ur_id` int(11) NOT NULL AUTO_INCREMENT,
  `ur_user_id` int(11) DEFAULT NULL,
  `ur_role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT into users VALUES(1,'admin','123456');
INSERT into roles values(1,'超级管理员','ROLE_ADMIN'),(2,'普通用户','ROLE_USER');
INSERT into user_roles VALUES(1,1,1),(2,1,2);