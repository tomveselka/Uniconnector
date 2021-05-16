package com.tomveselka.uniconnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
//@ComponentScan(basePackages = "com.tomveselka.uniconnector.main.controllers")
public class UniConnectorApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(UniConnectorApplication.class, args);
	}

}
