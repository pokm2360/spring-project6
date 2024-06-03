package com.example.demo.controller;

import java.util.Locale;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ParamController1 {
	
//	GET localhost:8080/headers1
	@ResponseBody
	@RequestMapping("/headers1")
	public String headers1(HttpServletRequest request,	
							HttpServletResponse response,
							HttpMethod httpMethod,
							Locale locale,
							@RequestHeader MultiValueMap<String, String> headerMap,
							@RequestHeader("host") String host,
							@CookieValue(value = "myCookie", required = false) String cookie) {
		
		System.out.println("request=" + request); // 요청 메세지
		System.out.println("response=" + response); // 응답 메세지
		System.out.println("httpMethod=" + httpMethod); // http 메소드
		System.out.println("locale=" + locale); //국가
		System.out.println("headerMap=" + headerMap); //모든 헤더
		System.out.println("header host=" + host); // 특정 헤더
		
		return "ok";
	}
}
