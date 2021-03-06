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
	@GetMapping("/detail/{bno}")
	public ResponseEntity<BoardDto> detailBoard(@PathVariable int bno) {
		logger.debug("detailBoard - 호출");
		return new ResponseEntity<BoardDto>(boardService.detailBoard(bno), HttpStatus.OK);
	}

    @ApiOperation(value = "새로운 게시글 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping(value="/write")
	public ResponseEntity<String> writeBoard(@RequestBody BoardDto board) {
		logger.debug("writeBoard - 호출");
		boardService.writeBoard(board);
		
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/update/{bno}")
	public ResponseEntity<String> updateBoard(@RequestBody BoardDto board, @PathVariable int bno) {
		logger.debug("updateBoard - 호출");
		logger.debug("" + board);
		board.setBno(bno);
		boardService.updateBoard(board);
		
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/delete/{bno}")
	public ResponseEntity<String> deleteBoard(@PathVariable int bno) {
		logger.debug("deleteBoard - 호출");
		if (boardService.deleteBoard(bno)<1) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
    
    @ApiOperation(value = "bno에 해당하는 댓글 목록을 반환한다.", response = List.class)
	@GetMapping("/comment/{bno}")
	public ResponseEntity<List<CommentDto>> getCmtList(@PathVariable("bno") int bno) {
		logger.debug("listComment - 호출");
		return new ResponseEntity<>(boardService.getCmtList(bno), HttpStatus.OK);
	}

	@ApiOperation(value = "새로운 댓글을 작성한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping("/comment")
	public ResponseEntity<String> writeComment(@RequestBody CommentDto comment) {
		logger.debug("writeComment - 호출");
		if(boardService.writeComment(comment)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	@ApiOperation(value = "글번호가 bno에 해당하는 댓글을 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/comment")
	public ResponseEntity<String> updateComment(@RequestBody CommentDto comment) {
		logger.debug("updateComment - 호출");
		logger.debug("" + comment);
		System.out.println("댓글 수정하자~~~~!"  + comment);
		if(boardService.updateComment(comment)) {
			System.out.println("댓글 수정 성공 무야호~~~");
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	@ApiOperation(value = "댓글번호가 cno에 해당하는 댓글을 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/comment/{cno}")
	public ResponseEntity<String> deleteComment(@PathVariable("cno") int cno) {
		logger.debug("deleteComment - 호출");
		if(boardService.deleteComment(cno)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
}