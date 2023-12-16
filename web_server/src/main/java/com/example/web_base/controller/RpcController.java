package com.example.web_base.controller;

import com.silhouette.rpcinfo.RpcInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rpc")
public class RpcController {

    @GetMapping("call")
    public Object callRpc(){
        return RpcInfo.ReqInfo.class.getName();
    }
}
