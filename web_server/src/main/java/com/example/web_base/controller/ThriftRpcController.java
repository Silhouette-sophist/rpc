package com.example.web_base.controller;

import com.example.web_base.service.ThriftClient;
import com.silhouette.rpcinfo.thrift.ThriftReqInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("rpc")
public class ThriftRpcController {

    @Autowired
    ThriftClient thriftClient;

    @GetMapping("thrift")
    public Object callRemote(){
        try {
            thriftClient.open();
            ThriftReqInfo thriftReqInfo = new ThriftReqInfo();
            thriftReqInfo.setReqId(UUID.randomUUID().toString());
            thriftReqInfo.setParam("thrift test");
            return thriftClient.getService().remoteCall(thriftReqInfo);
        } catch (Exception e){
            log.error("ThriftRpcController error: ", e);
        } finally {
            thriftClient.close();
        }
        return "failed";
    }
}
