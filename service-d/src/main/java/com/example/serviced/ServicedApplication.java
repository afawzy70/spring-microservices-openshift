package com.example.serviced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/service-d")
public class ServicedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicedApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Serviced!";
    }
}