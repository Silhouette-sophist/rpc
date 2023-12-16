//这里指明了代码生成之后,所处的文件路径
namespace java com.silhouette.rpcinfo.thrift

struct ThriftReqInfo {
    1:optional string reqId
    2:optional string param
}

struct ThriftRespInfo {
    1:optional string respId,
    2:optional string msg
    3:optional i8 code
}
