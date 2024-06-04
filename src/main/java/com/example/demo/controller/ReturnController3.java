package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/return3")
public class ReturnController3 {
	
//	@ResponsBody가 자동으로 적용됨
//	@ResponsBody
	@GetMapping("/ex1")
	public String ex1() {
		return "Hi~";
	}
}
