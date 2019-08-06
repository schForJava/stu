package com.example.demo.controller;

import com.example.demo.feign.HelloFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
   @Autowired
   private HelloFeign helloFeign;

    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "helloHystrix")
    public String hello(@PathVariable String name){
        return helloFeign.helloFeidn(name);
    }


    public String helloHystrix(String name){
        return "stop";
    }

}
