package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/api/hello")
	public String hello() {
		System.out.println("hello");
		return "현재 서버시간은 " + new Date() + " 이다.";
	}
	
	@PostMapping("/api/bye")
	public String bye() {
		System.out.println("bye");
		return "바이바이";
	}
}
