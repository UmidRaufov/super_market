package com.dev24.super_market.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String method() {
        return "hello world";
    }

    @GetMapping("/git")
    public String git(){
        return "Hello Git";
    }
}
