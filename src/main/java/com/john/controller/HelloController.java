package com.john.controller;

import com.john.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world Spring boot2";
    }

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car getCar() {
        return car;
    }
}
