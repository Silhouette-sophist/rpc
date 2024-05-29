//package com.example.web_base.controller;
//
//import com.example.web_base.service.RpcServiceImpl;
//import com.silhouette.rpcinfo.RpcInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/rpc")
//public class RpcController {
//
//    @Autowired
//    RpcServiceImpl rpcService;
//
//    @GetMapping("call")
//    public Object callRpc(){
//        return RpcInfo.ReqInfo.class.getName();
//    }
//}
