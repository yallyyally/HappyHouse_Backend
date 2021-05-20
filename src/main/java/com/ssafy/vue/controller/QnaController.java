package com.ssafy.vue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.dto.QuestionDto;
import com.ssafy.vue.service.AnswerService;
import com.ssafy.vue.service.QuestionService;

import io.swagger.annotations.ApiOperation;

//큐앤에이 관련
@RestController
@RequestMapping("/api/qna")
public class QnaController {
	
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;
	
////////////////////questionService//////////////////////////
//	질문 쓰기
	@PostMapping("/question")
	@ApiOperation(value="질문 작성 요청")
	public ResponseEntity insertQuestion(@RequestBody QuestionDto questionDto) {
		System.out.println("질문 작성 요청 ~");
		questionService.insertQuestion(questionDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
////////////////////answerService//////////////////////////

}
