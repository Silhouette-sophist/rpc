//package com.example.web_base.service;
//
//import com.silhouette.rpcinfo.RpcInfo;
//import com.silhouette.rpcservice.RpcServiceGrpc;
//import io.grpc.stub.StreamObserver;
//import lombok.extern.slf4j.Slf4j;
//import net.devh.boot.grpc.server.service.GrpcService;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//@Slf4j
//@GrpcService
//public class RpcServiceImpl extends RpcServiceGrpc.RpcServiceImplBase {
//    @Override
//    public void remoteCall(RpcInfo.ReqInfo request, StreamObserver<RpcInfo.RespInfo> responseObserver) {
//        log.info("RpcServiceImpl remote call with: {} at: {}", request, LocalDateTime.now());
//        responseObserver.onNext(RpcInfo.RespInfo.newBuilder()
//                .setRespId(UUID.randomUUID().toString())
//                .setCode(200)
//                .setMsg("from RpcServiceImpl").build()
//        );
//        responseObserver.onCompleted();
//    }
//}
