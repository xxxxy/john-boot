package com.john.boot.controller;

import com.john.boot.bean.Car;
import com.john.boot.bean.Person;
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

    @RequestMapping("/car1")
    public Car getCar() {
        return car;
    }

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        String userName = person.getUserName();
        System.out.println(userName);
        return person;
    }
}
