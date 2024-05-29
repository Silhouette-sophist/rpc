//package com.example.web_client.config;
//
//import com.silhouette.rpcservice.RpcServiceGrpc;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GrpcServiceConfig {
//
//    @Bean
//    public ManagedChannel getChannel(@Value("${grpc.server.port}") int grpcServerPort) {
//        return ManagedChannelBuilder.forAddress("localhost", grpcServerPort)
//                .usePlaintext()
//                .build();
//    }
//    @Bean
//    public RpcServiceGrpc.RpcServiceBlockingStub getStub(ManagedChannel channel) {
//        return RpcServiceGrpc.newBlockingStub(channel);
//    }
//}