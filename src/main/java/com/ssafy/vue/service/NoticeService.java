package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.NoticeDto;

public interface NoticeService {
	
	public void insertNotice(NoticeDto noticeDto);
	public List<NoticeDto> getNoticeList();
	public NoticeDto readNotice();
	public void deleteNotice();
	public void updateNotice();
	
}
