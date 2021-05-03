package com.example.Zdarova;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/")
    public String page(){
        return "Zdarova";
    }

    @RequestMapping("/test")
    public String display(){
        return "Hello, man";
    }

}