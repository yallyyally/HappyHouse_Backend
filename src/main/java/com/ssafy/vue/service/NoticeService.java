package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.NoticeDto;

public interface NoticeService {
	
	public void insertNotice(NoticeDto noticeDto);
	public List<NoticeDto> getNoticeList();
	public NoticeDto readNotice(int num);
	public void updateNotice(int num, NoticeDto noticeDto);
	public void deleteNotice(int num);
	
}
