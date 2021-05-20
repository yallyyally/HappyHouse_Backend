package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.BoardDto;

public interface BoardService {
	
	public List<BoardDto> retrieveBoard();
	public List<String> retrieveWriter();
	public BoardDto detailBoard(int no);
	public boolean writeBoard(BoardDto board);
	public boolean updateBoard(BoardDto board);
	public boolean deleteBoard(int no);
}
