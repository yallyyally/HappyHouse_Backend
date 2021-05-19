package com.ssafy.vue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/house")
public class HouseController {
	
	@GetMapping
	public void getConnection() {
		System.out.println("house로 연결요청 스 ~~~~~~");
		System.out.println("무야호 ");
	}
	
//	매물 요청
//	매물 검색/sdfsf
	//test
	
}
