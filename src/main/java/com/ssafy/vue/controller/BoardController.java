package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.ssafy.vue.dto.BoardDto;
import com.ssafy.vue.dto.CommentDto;
import com.ssafy.vue.service.BoardService;

import io.swagger.annotations.ApiOperation;

//http://localhost:9999/vue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)

@RestController
@RequestMapping("/api/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private BoardService boardService;

    @ApiOperation(value = "모든 게시글의 정보를 반환한다.", response = List.class)
	@GetMapping(value="/retrieve")
	public ResponseEntity<List<BoardDto>> retrieveBoard() throws Exception {
    	System.out.println("자유게시판 연결해주라~~~");
		logger.debug("retrieveBoard - 호출");
		return new ResponseEntity<List<BoardDto>>(boardService.retrieveBoard(), HttpStatus.OK);
	}
    
    @ApiOperation(value = "자유게시판에 글을 작성할 수 있는 모든 사용자의 정보를 반환한다.", response = List.class)
	@GetMapping(value = "/writerList")
	public ResponseEntity<List<String>> retrieveWriter() throws Exception {
		logger.debug("retrieveWriter - 호출");
		return new ResponseEntity<List<String>>(boardService.retrieveWriter(), HttpStatus.OK);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 반환한다.", response = BoardDto.class)    
	@GetMapping("/detail/{no}")
	public ResponseEntity<BoardDto> detailBoard(@PathVariable int no) {
		logger.debug("detailBoard - 호출");
		return new ResponseEntity<BoardDto>(boardService.detailBoard(no), HttpStatus.OK);
	}

    @ApiOperation(value = "새로운 게시글 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping(value="/write")
	public ResponseEntity<String> writeBoard(@RequestBody BoardDto board) {
		logger.debug("writeBoard - 호출");
		if (boardService.writeBoard(board)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/update/{no}")
	public ResponseEntity<String> updateBoard(@RequestBody BoardDto board) {
		logger.debug("updateBoard - 호출");
		logger.debug("" + board);
		
		if (boardService.updateBoard(board)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/delete/{no}")
	public ResponseEntity<String> deleteBoard(@PathVariable int no) {
		logger.debug("deleteBoard - 호출");
		if (boardService.deleteBoard(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
    
    @ApiOperation(value = "새로운 댓글을 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping(value="/detail/{no}")
	public ResponseEntity<String> writeComment(@RequestBody CommentDto comment) {
		logger.debug("writeComment - 호출");
		if (boardService.writeComment(comment)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

    @ApiOperation(value = "댓글번호에 해당하는 댓글의 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/update/{no}")
	public ResponseEntity<String> updateComment(@RequestBody CommentDto comment) {
		logger.debug("updateComment - 호출");
		logger.debug("" + comment);
		
		if (boardService.updateComment(comment)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

    @ApiOperation(value = "댓글번호에 해당하는 댓글의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/delete/{no}")
	public ResponseEntity<String> deleteComment(@PathVariable int no) {
		logger.debug("deleteComment - 호출");
		if (boardService.deleteComment(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
}