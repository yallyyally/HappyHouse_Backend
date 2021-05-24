package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.BoardDto;
import com.ssafy.vue.dto.CommentDto;

public interface BoardService {
	
	public List<BoardDto> retrieveBoard();
	public List<String> retrieveWriter();
	public BoardDto detailBoard(int bno);
	public int writeBoard(BoardDto board);
	public int updateBoard(BoardDto board);
	public int deleteBoard(int bno);
	
	public List<CommentDto> getCmtList(int bno);
	public boolean writeComment(CommentDto comment);
	public boolean updateComment(CommentDto comment);
	public boolean deleteComment(int cno);
}
