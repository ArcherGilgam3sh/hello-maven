package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/lab13")
    public String lab13() {
        return "hello, this is from CS304 zhangfuheng12011322";
    }
}
