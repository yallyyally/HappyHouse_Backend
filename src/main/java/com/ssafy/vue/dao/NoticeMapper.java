package com.ssafy.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.NoticeDto;

@Mapper
public interface NoticeMapper {
	
	public void insertNotice(NoticeDto noticeDto);
	public List<NoticeDto> getNoticeList();
	public NoticeDto readNotice(int num);
	public void deleteNotice();
	public void updateNotice();
	
}
