package com.bridgelabz.helloApp.controller;


import com.bridgelabz.helloApp.dto.User;
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

    //UC4
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user){
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "from bridgelabz";
    }

    //UC5
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from Bridgelabz";
    }



}
