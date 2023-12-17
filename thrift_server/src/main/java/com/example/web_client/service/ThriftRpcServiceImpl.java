package com.example.web_client.service;

import com.silhouette.rpcinfo.thrift.ThriftReqInfo;
import com.silhouette.rpcinfo.thrift.ThriftRespInfo;
import com.silhouette.rpcservice.thrift.ThriftRpcService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class ThriftRpcServiceImpl implements ThriftRpcService.Iface {
    @Override
    public ThriftRespInfo remoteCall(ThriftReqInfo reqInfo) throws TException {
        log.info("ThriftRpcServiceImpl remoteCall with: {} at: {}", reqInfo, LocalDateTime.now());
        ThriftRespInfo thriftRespInfo = new ThriftRespInfo();
        thriftRespInfo.setCode(200);
        thriftRespInfo.setRespId(UUID.randomUUID().toString());
        thriftRespInfo.setMsg("thrift server resp");
        return thriftRespInfo;
    }
}
