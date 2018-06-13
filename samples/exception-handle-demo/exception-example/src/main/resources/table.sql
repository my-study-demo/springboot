DROP TABLE IF EXISTS `sys_exception_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_exception_info` (
  `EI_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `EI_CODE` varchar(30) DEFAULT NULL COMMENT '异常码',
  `EI_MESSAGE` varchar(50) DEFAULT NULL COMMENT '异常消息内容',
  PRIMARY KEY (`EI_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='系统异常基本信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_exception_info`
--

LOCK TABLES `sys_exception_info` WRITE;
/*!40000 ALTER TABLE `sys_exception_info` DISABLE KEYS */;
INSERT INTO `sys_exception_info` VALUES (1,'USER_NOT_FOUND','用户不存在.'),(2,'USER_STATUS_FAILD','用户状态异常.');
/*!40000 ALTER TABLE `sys_exception_info` ENABLE KEYS */;
UNLOCK TABLES;