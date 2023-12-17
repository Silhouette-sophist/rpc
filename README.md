## rpc实战

### rpc_info
定义了rpc协议文件
- proto
- thrift

### grpc_server
- 服务启动于8080端口
- 监听9091端口，启动了grpc服务

### thrift_server
- 服务启动于8083端口
- 监听8895端口，启动了thrift服务

### 问题
- grpc和thrift服务似乎不可同时启动？
- grpc有比较官方的starter，方便使用
- thrift没有比较官方的starter，需要手动配置bean到容器中，并且thrift server启动像是阻塞式？