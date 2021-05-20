package com.ssafy.vue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.dto.AnswerDto;
import com.ssafy.vue.dto.QuestionDto;
import com.ssafy.vue.service.AnswerService;
import com.ssafy.vue.service.QuestionService;

import io.swagger.annotations.ApiOperation;

//큐앤에이 관련
@RestController
@RequestMapping("/api/qna")
@CrossOrigin(origins = { "*" }, maxAge = 6000)
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
	
//	전체 질문 불러오기
	@GetMapping("/question")
	@ApiOperation(value="전체 질문 조회")
	public ResponseEntity<List<QuestionDto>> getQuestionList(){
		return new ResponseEntity<List<QuestionDto>>(questionService.getQuestionList(),HttpStatus.OK);
	}
	
//	특정 질문 불러오기
	@GetMapping("/question/{num}")
	@ApiOperation(value="특정 질문 조회")
	public ResponseEntity<QuestionDto> readQuestion(@PathVariable int num){
		return new ResponseEntity<QuestionDto> (questionService.readQuestion(num),HttpStatus.OK);
	}
	
//	질문 수정 -> 답변이 하나 이상 있는 질문은 수정할 수 없도록 조치.
//	프론트에서 나중에 답변 수를 state로 관리해서 조치해도 될듯
	@GetMapping("/question/{num}/edit")
	@ApiOperation(value="질문 수정페이지 이동 - 답변이 하나 이상 있는 질문은 수정 불가")
//	answerService 메소드 빌려 써도 될듯.
	public ResponseEntity questionEditPossible(@PathVariable int num) {
		if(questionService.countAnswer(num) != 0)
			return new ResponseEntity<>("impossible",HttpStatus.OK);
		else 
			return new ResponseEntity<>("possible",HttpStatus.OK);
	}

//	질문 수정
	@PutMapping("/question/{num}")
	@ApiOperation(value="num번째 질문 수정쓰")
	public ResponseEntity updateQuestion(@PathVariable int num, @RequestBody QuestionDto questionDto) {
		questionService.updateQuestion(num, questionDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
//	질문 삭제 -> 답변이 하나 이상 있으면 삭제 못하게 조취
	@DeleteMapping("/question/{num}/delete")
	@ApiOperation(value="삭제 버튼 누르면 작동되는 메소드, 답변이 하나 이상 달리면 삭제 못하도록 막아야 함.")
//	answerService 메소드 빌려 써도 될듯.
	public ResponseEntity questionDeletePossible(@PathVariable int num) {
		if(questionService.countAnswer(num) != 0)
			return new ResponseEntity<>("impossible",HttpStatus.OK);
		else {
			questionService.deleteQuestion(num);
			System.out.println(" 삭제 완");
			/////////////////////////
//			답변 디비도 다 삭제해야함 ! 
			/////////////////////////
			return new ResponseEntity<>("possible",HttpStatus.OK);
		}
	}

	
////////////////////answerService//////////////////////////
//	답변 쓰기 -> num번째 질문에 대한 답변.
//	현재 질문 글 번호를 프론트에서 저장하고 있엉 ㅑ할듯
//	이때 body 안에 질문 번호도 넣어서 들어와야 함.
	@PostMapping("/answer")
	@ApiOperation(value="특정 질문에 대한 답글 작성")
	public ResponseEntity insertAnswer(@RequestBody AnswerDto answerDto) {
		answerService.insertAnswer(answerDto);
		System.out.println("답변 완");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
//	답변 목록 가져오기 - num 번째 질문.
	@GetMapping("/answer/{num}")
	public ResponseEntity<List<AnswerDto>> getAnswerList(@PathVariable int num){
		return new ResponseEntity<List<AnswerDto>>(answerService.getAnswerList(num),HttpStatus.OK);
	}
//	답변 수정
//	현재 질문 글 번호를 프론트에서 저장하고 있엉 ㅑ할듯

//	답변 삭제
	

	
}
