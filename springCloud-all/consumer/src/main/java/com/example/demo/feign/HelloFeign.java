package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="provider-user")
public interface HelloFeign {
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String helloFeidn(@PathVariable("name") String name);
}
