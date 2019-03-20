package com.example.hotrestart.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: hotrestart
 * @description: WebConfiguration
 * @author: richen
 * @create: 2019-03-14 15:32
 **/
@Configuration
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    public FilterRegistrationBean testFilterRegistration(){

    }
}
