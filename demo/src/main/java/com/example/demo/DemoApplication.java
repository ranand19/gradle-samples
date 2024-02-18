package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	// @Autowired
	// private SampleBean bean;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// for (String arg : args) {
		// 	System.out.println(arg);
		// }	
	}

}
