package com.example.hotrestart.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author richen
 */
@RestController
@Slf4j
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        log.info("11111111111111");
        return  "hello world";
    }

    @RequestMapping("/test")
    public String hello2(){
        log.info("22222222222222");
        return "dsfsdfdsfds";
    }
}
