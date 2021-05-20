package com.ssafy.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.CommentDto;

@Mapper
public interface CommentMapper {
	
	public List<CommentDto> cmtList(int bno);
	public int insertComment(CommentDto comment);
	public int updateComment(CommentDto comment);
	public int deleteComment(int cno);
	
}
