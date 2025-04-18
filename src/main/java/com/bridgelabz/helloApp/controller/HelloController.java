package com.bridgelabz.helloApp.controller;


import org.springframework.web.bind.annotation.*;

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
    public String sayHelloquery(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from Bridgelabz";
    }

    //UC3
    @GetMapping("/pathvar/{name}")
    public String sayHellopath(@PathVariable String name){
        return "Hello" + name + " from Bridgelabz";
    }

}
