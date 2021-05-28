package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String index() {
//		return "Greetings from Spring Boot!";
		try {
			return helloService.testService();
		} catch (Exception ex) {

			return "Exception";
		}
	}

}
