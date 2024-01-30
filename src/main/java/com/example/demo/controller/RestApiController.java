package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/greet")
    public String  getHelloWorld(){
        return "Hello World";
    }
    @GetMapping("/greet/{name}")
    public static String getGreet(@PathVariable("name") String name){
       return "Hello "+name;
    }
}
