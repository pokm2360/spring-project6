package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

@RestController
@RequestMapping("/return")
public class Quizcontroller3 {
	
	@GetMapping("/q1")
	public void quiz1() {
		
	}
	
	@GetMapping("/q2")
	    public void q2() { 
	        return "templates/return/test.html";
	    }
	
	@GetMapping("/q3")
		public StudentDTO q3() {
			StudentDTO studentDto = new StudentDTO(1,"둘리",3);
			return studentDto;
	}
	
	@GetMapping("/q4")
	public CarDTO q4() {
		CarDTO carDto = new CarDTO("현대","코나","블랙");
		return carDto;
	}
	
	@GetMapping("/q5")
	public List<StudentDTO> q5() {
		List <StudentDTO> list = new ArrayList<>();
		list.add(new StudentDTO(1,"둘리",3));
		list.add(new StudentDTO(2,"또치",1));
		list.add(new StudentDTO(3,"도우너",2));
		return list;
	}
	
	@GetMapping("/q6")
	public ResponseEntity q6() {
		return new ResponseEntity("response fail...",HttpStatus.INTERNAL_SERVER_ERROR); //500 강제로 에러를 일으킴
	}
	
	@GetMapping("/q7")
	public ResponseEntity<CarDTO> q7() {
		CarDTO carDto = new CarDTO("현대","코나","블랙");
		return new ResponseEntity<>(carDto, HttpStatus.OK); //200 ok 응답 + Book 객체
	}
}
