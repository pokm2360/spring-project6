//package com.example.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller // 컨트롤러로 지정 + 빈 생성해서 담기
//public class MappingController1 {
//
//	@ResponseBody
////	GET localhost:8080/board
////	@RequestMapping(value = "/board", method = RequestMethod.GET)
//	@GetMapping("/board") // 위와 의미 같음
//	public String list() {
//		System.out.println("게시물 조회..");
//		return "ok";
//	}
//	
////	POST localhost:8080/board
//	@ResponseBody
//	@PostMapping("/board")
//	public String save() {
//		System.out.println("게시물 등록..");
//		return "ok";
//	}
//	
////	PUT localhost:8080/board
//	@ResponseBody
//	@PutMapping("/board")
//	public String modify() {
//		System.out.println("게시물 수정..");
//		return "ok";
//	}
//	
////	DELETE localhost:8080/board
//	@ResponseBody
//	@DeleteMapping("/board")
//	public String remove() {
//		System.out.println("게시물 삭제..");
//		return "ok";
//	}
//	
//	
//}
//package com;

