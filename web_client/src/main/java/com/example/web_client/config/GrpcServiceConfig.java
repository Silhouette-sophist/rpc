package com.example.web_client.config;

import com.silhouette.rpcservice.RpcServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServiceConfig {
    @Bean
    public ManagedChannel getChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
    }
    @Bean
    public RpcServiceGrpc.RpcServiceBlockingStub getStub(ManagedChannel channel) {
        return RpcServiceGrpc.newBlockingStub(channel);
    }
}