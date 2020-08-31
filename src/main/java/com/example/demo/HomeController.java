package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:james
 * day:2020-08-30
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "<h1>Home</h1>";
    }
    @GetMapping("/user")
    public String user(){
        return "<h1>Hello User</h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>Hello Admin</h1>";
    }
}
