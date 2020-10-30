package com.introducto.introductoversionsjava11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IntroductoVersionsJava11Application {

    @GetMapping
    public String hello(){
        return "Hello from Project using Java11";
    }

    public static void main(String[] args) {
        SpringApplication.run(IntroductoVersionsJava11Application.class, args);
    }

}
