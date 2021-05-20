package com.ssafy.vue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.dto.NoticeDto;
import com.ssafy.vue.service.NoticeService;

import io.swagger.annotations.ApiOperation;

//공지사항 관련
@RestController
@RequestMapping("/api/notices")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	
//	공지사항 쓰기.
	@PostMapping("/notice")
	@ApiOperation(value="공지사항에 글 쓰기 요청.")
	public ResponseEntity insertNotice(@RequestBody NoticeDto noticeDto) {
		System.out.println("공지사항 작성 요청 ~~");
		noticeService.insertNotice(noticeDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
