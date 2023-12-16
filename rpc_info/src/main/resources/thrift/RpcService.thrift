
include "RpcParam.thrift"

//这里指明了代码生成之后,所处的文件路径
namespace java com.silhouette.rpcservice.thrift

service ThriftRpcService {
    RpcParam.ThriftRespInfo remoteCall(1:required RpcParam.ThriftReqInfo reqInfo)
}