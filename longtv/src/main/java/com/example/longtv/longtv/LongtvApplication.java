package com.example.longtv.longtv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.longtv")
public class LongtvApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LongtvApplication.class, args);
	}

}
