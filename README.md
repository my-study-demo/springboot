#springboot

## commons
    公共部分
 
- logback 


## components 
    组件部分
 
- demo

## samples
    案例
 
- first
  
    >依赖组件demo

- config
    
    >配置
    
- redis-message

    >redis消息队列
    
- druid

    >druid数据库监控
    >使用拦截器记录你的SpringBoot的请求日志
    >自定义静态资源文件路径
    
- message-converter

    >fastjson消息转换器[WebMvcConfigurerAdapter配置类说明](https://www.jianshu.com/p/2c2cdb80fe47)
    
- springboot-with-docker

    >集成docker
    
- interceptor

    >拦截器（模拟登录token认证）[WebMvcConfigurerAdapter配置类说明](https://www.jianshu.com/p/2c2cdb80fe47)
    
- jwt

- docker-demo

- data-validator

    >请求参数校验
    
- cosr

    >跨域处理
    
- scheduled-demo

    >定时任务
    
- event-demo

    >事件案例
    > * 同步
    >   * @EventListener注解方法
    >   * 集成ApplicationListener，泛型，无序
    >   * SmartApplicationListener，泛型，有序
    > * 异步（@EnableAsync、@Async）
    >   * UserRegisterSendMailListener
    
- test-autoconfigure-demo
    >AutoConfiguration自定义Starter，组件开发，测试组件调用
    
- rabbitmq-demo
    >基于SpringBoot项目整合RabbitMQ消息队列，完成DirectExchange（路由键）分布式消息消费。