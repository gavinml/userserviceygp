package com.inspur.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/userservice.ilf")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }


}
