package com.example.hotrestart.controller;

import com.example.hotrestart.entity.Brand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hotrestart
 * @description: Hello
 * @author: richen
 * @create: 2019-03-14 11:32
 **/
@RestController
@Slf4j
public class Hello {
    @PostMapping("hello")
    public String brand(@RequestBody Brand brand){
        String name = brand.getName();
        return name;
    }
}
