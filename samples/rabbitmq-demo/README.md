#rabbitmq

##单机安装步骤

```bash
docker search rabbitmq:management
docker pull rabbitmq:management
docker run -d --name rabbitmq --publish 5671:5671 --publish 5672:5672 --publish 4369:4369 --publish 25672:25672 --publish 15671:15671 --publish 15672:15672 rabbitmq:management
```
注意：如果docker pull rabbitmq 后面不带management，启动rabbitmq后是无法打开管理界面的，所以我们要下载带management插件的rabbitmq.

安装成功后访问：[http://192.168.1.116:15672/](http://192.168.1.116:15672/)

参考：[https://blog.csdn.net/liyuejin/article/details/78410586](https://blog.csdn.net/liyuejin/article/details/78410586)


##RabbitMQ中有三种常用的转发方式

- direct
    * DirectExchange：路由键方式转发消息，根据设置的路由键的值进行完全匹配时转发

- topic
    * TopicExchange：主题匹配方式转发消息
    
- fanout
    * FanoutExchange：广播方式转发消息