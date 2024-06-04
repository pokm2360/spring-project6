package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/method")
@Controller
public class Quizcontroller {
	@ResponseBody
	@GetMapping("/q") // 어노테이션이 같으면 아래는 생략가능 / 메소드 종류 꼭 확인!!
	public String list() {
		System.out.println("test1");
		return "ok";
	}
	
	@ResponseBody
	@PostMapping
	public String save() {
		System.out.println("test2");
		return "ok";
	}
	
	@ResponseBody
	@PutMapping
	public String modify() {
		System.out.println("test3");
		return "ok";
	}
	
	@ResponseBody
	@DeleteMapping
	public String remove() {
		System.out.println("test4");
		return "ok";
	}
}
