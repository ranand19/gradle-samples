package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Configuration
public class SampleBean {

    @Value("${app.user.name}")
    private String username;

    public String getUsername() {
        return username;
    }

    @PostConstruct
    public void doExamples() {
        System.out.println("Calling bean method with this result: " +  getUsername());
    }
    
}
