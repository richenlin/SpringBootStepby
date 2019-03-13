package com.example.muiltdb;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class ConnectionLogFilter extends FilterEventAdapter {
    public void connection_connectionBefore(FilterChain chain, Properties info){
        log.info("BEFORE CONNECTION!");
    }

    @Override
    public void connection_connectAfter(ConnectionProxy connection) {
        log.info("AFTER CONNECTION!");
    }

}
