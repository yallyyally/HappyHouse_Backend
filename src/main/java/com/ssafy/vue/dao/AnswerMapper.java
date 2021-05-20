package com.ssafy.vue.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.vue.dto.AnswerDto;

@Mapper
public interface AnswerMapper {
	public void insertAnswer(@Param("answerDto") AnswerDto answerDto);

}
