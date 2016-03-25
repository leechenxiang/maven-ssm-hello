db.properties: 数据库连接参数
log4j.properties： 日志


applicationContext-dao.xml： spring 和 mybatis 整合的一些配置（sqlSessionFactory，mapper 配置）
applicationContext-service.xml： 业务
applicationContext.xml： spring 核心配置文件（配置一些公用的内容，比如数据源，事务）
springmvc.xml： springmvc 全局配置文件

SqlMapConfig.xml： mybatis 全局配置文件