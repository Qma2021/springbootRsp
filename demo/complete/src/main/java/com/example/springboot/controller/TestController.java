package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dataBean.PersonalBO;

@RestController
public class TestController {
	@Autowired
	PersonalBO personal;
	
	@RequestMapping("/test/")
	public String hello() {
	
		System.out.println(personal.getAuthor());
		
		return "test";
	}
	
	
	
}
