# springboot-eureka

####  springboot-client 客户端1
接口服务：http://localhost:8763/hello?str=123

返回：hello 123
####  springboot-client2 客户端2
接口服务：http://localhost:8080/test?name=xiaoming

返回：hello xiaoming

后台调用客户端1的hello接口
####  springboot-server 服务端1
master

监控地址：http://master:8761/

####  springboot-server2 服务端2
slaver1

监控地址：http://slaver1:9090/
####  springboot-server3 服务端3
slaver2

监控地址：http://slaver2:9091/

### host文件配置
127.0.0.1 master

127.0.0.1 slaver1

127.0.0.1 slaver2
