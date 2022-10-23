package com.example.interceptor.controller;

import com.example.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Auth
@RestController
@RequestMapping("/api/private")
public class PrivateController {

    @GetMapping("/hello")
    public String hello() {
        log.info("private hello controller");
        return "private hello";
    }
}
