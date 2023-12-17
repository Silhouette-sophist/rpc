package com.example.web_base.service;

import com.silhouette.rpcservice.thrift.ThriftRpcService;
import lombok.Data;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

@Data
public class ThriftClient {
    private String host;
    private Integer port;

    private TTransport tTransport;

    private TProtocol tProtocol;

    private ThriftRpcService.Client client;

    private void init() {
        tTransport = new TFramedTransport(new TSocket(host, port), 600);
        //协议对象 这里使用协议对象需要和服务器的一致
        tProtocol = new TCompactProtocol(tTransport);
        client = new ThriftRpcService.Client(tProtocol);
    }

    public ThriftRpcService.Client getService() {
        return client;
    }

    public void open() throws TTransportException {
        if (null != tTransport && !tTransport.isOpen())
            tTransport.open();
    }

    public void close() {
        if (null != tTransport && tTransport.isOpen())
            tTransport.close();
    }
}
