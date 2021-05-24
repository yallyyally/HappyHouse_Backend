package com.ssafy.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.BoardDto;

@Mapper
public interface BoardMapper {
	
	public List<BoardDto> selectBoard();
	public List<String> writerList();
	public BoardDto selectBoardByNo(int bno);
	public int insertBoard(BoardDto board);
	public int updateBoard(BoardDto board);
	public int deleteBoard(int bno);
}