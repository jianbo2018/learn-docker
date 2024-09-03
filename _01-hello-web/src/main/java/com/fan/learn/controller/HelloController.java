package com.fan.learn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {
    @RequestMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.now().format(formatter) + ": hello " + name + "\r\n";
    }
}
