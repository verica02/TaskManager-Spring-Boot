package com.example.myspringproject;

//hello page

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello") // localhost:3232/hello will return the following

    String hello(){
        return "Hello world";
    }

}
