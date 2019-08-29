package com.practice.demoproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;.org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/");
    public String index(){
        return "Greetings From Spring Boot!";
    }



}
