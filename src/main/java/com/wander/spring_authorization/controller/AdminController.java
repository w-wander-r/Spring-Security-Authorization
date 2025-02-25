package com.wander.spring_authorization.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @GetMapping
    public String get() {
        return "GET:: admin controller";
    }
    
    @PostMapping
    public String post() {
        return "POST:: admin controller";
    }
    
    @PutMapping
    public String put() {
        return "PUT:: admin controller";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE:: admin controller";
    }
}
