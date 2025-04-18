package com.bridgelabz.helloApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    //UC1
    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    //UC2
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from Bridgelabz";
    }



}
