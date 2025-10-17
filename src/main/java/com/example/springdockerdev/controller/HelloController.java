package com.example.springdockerdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // A simple REST endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Dockerized Spring Boot with PostgreSQL and jack and bibi ko!";
    }
}
