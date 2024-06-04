package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

@Controller
@RequestMapping("param")
public class Quizcontroller2 {

//	2.파라미터 형태
//	간단 -> @RequestParam 또는 @PathVariable
//	복잡 -> @RequestParam, @PathVariable 보다는 @RequestBody
//	@RequestParam - 쿼리파라미터
	
//	localhost:8080/param/q1?s=hello
	@ResponseBody
	@GetMapping("/q1")
	public String q1(@RequestParam(name = "s") String s) {
		System.out.println("String형 파라미터 수집: " + s);
		return "ok";
	}
	
//	localhost:8080/param/q2?f=1.55f&b=true
	@ResponseBody
	@GetMapping("/q2")
	public String q2(@RequestParam(name = "f") float f,
						@RequestParam(name = "b") boolean b) {
		
		System.out.println("float형 파라미터 수집: " + f + "," + "boolean타입 파라미터 수집: " + b);
		return "ok";
	}
	
//	localhost:8080/param/q3?arr=a&arr=b&arr=c
	@ResponseBody
	@GetMapping("/q3")
	public String q3(@RequestParam(name = "arr") char [] arr ) {
		
		System.out.println("char형 배열 수집" + Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("배열의 개수: " + arr.length);
		return "ok";
	}
	
//	localhost:8080/param/register2
	@GetMapping("/register2")
	public String ex1() {
		return "/param/register2";
	}
	
//	localhost:8080/param/q4
	@ResponseBody
	@PostMapping("/q4")
	public String q4(StudentDTO dto) {
		
//		System.out.println("no="+dto.getNo() +", age="+dto.getName()+", grade"+dto.getGrade());
		System.out.println("객체 수집: " + dto.toString());
		return "ok";
	}
	
//	localhost:8080/param/q5
	@ResponseBody
	@PostMapping("/q5")
	public String q5(@RequestBody StudentDTO[] arr) {
		System.out.println("객체타입 리스트 수집: " + arr);
		
		for ( StudentDTO dto : arr ) {
			System.out.println(dto);
		}
		
		System.out.println(arr.length);
		return "ok";
	}
	
	@ResponseBody
	@PostMapping("/q6")
	public String quiz6(@RequestBody ArrayList<CarDTO> list) { //JSON -> 클래스 변환

		int size = list.size();

		System.out.println("객체타입 리스트 수집: " + list);

		for(CarDTO dto : list) {
			System.out.println(dto);
		}

		System.out.println("리스트 마지막 요소: " + list.get(size-1));

		return "ok";
	}
}
