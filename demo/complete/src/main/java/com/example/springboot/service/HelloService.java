package com.example.springboot.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	
public class HelloService {
	
	@Bean
	public String testService() {
		return "Service Tests";
	}
}
