package com.ssafy.vue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PostMapping("/")
	@ApiOperation(value="공지사항에 글 쓰기 요청.")
	public ResponseEntity insertNotice(@RequestBody NoticeDto noticeDto) {
		System.out.println("공지사항 작성 요청 ~~");
		noticeService.insertNotice(noticeDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
//	전체 공지사항 조회.
	@GetMapping("/")
	@ApiOperation(value="전체 공지사항 조회")
	public ResponseEntity<List<NoticeDto>> getNoticeList(){
		return new ResponseEntity<List<NoticeDto>>(noticeService.getNoticeList(),HttpStatus.OK);
		
	}
//	특정 번호 공지사항 조회...
	@GetMapping("{num}")
	public ResponseEntity<NoticeDto> readNotice(@PathVariable int num){
		return new ResponseEntity<NoticeDto>(noticeService.readNotice(num),HttpStatus.OK);
	}
	
	//	공지사항 수정.
	@PutMapping("{num}")
	public ResponseEntity updateNotice(@PathVariable int num, @RequestBody NoticeDto noticeDto){
		noticeService.updateNotice(num, noticeDto);
		System.out.println("수정 오나료.");
		return new ResponseEntity<>(HttpStatus.OK);
	}
//	공지사항 삭제
	@DeleteMapping("{num}")
	public ResponseEntity deleteNotice(@PathVariable int num){
		noticeService.deleteNotice(num);
		System.out.println("삭제오나료.");
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
