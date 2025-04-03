package com.example.servicec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/service-c")
public class ServicecApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicecApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Servicec!";
    }
}