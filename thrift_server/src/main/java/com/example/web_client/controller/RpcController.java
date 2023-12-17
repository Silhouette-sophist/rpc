package com.example.web_client.controller;

import com.silhouette.rpcinfo.RpcInfo;
import com.silhouette.rpcservice.RpcServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("rpc")
public class RpcController {

    @Autowired
    RpcServiceGrpc.RpcServiceBlockingStub rpcServiceBlockingStub;

    @GetMapping("grpc")
    public Object callRemote(){
        log.info("receive grpc call...");
        Iterator<RpcInfo.RespInfo> callRemote = rpcServiceBlockingStub.remoteCall(RpcInfo.ReqInfo.newBuilder()
                .setReqId(UUID.randomUUID().toString())
                .setMsg("call remote")
                .build()
        );
        callRemote.forEachRemaining(item -> log.info("receive remote resp: {}", item));
        return "success";
    }
}
