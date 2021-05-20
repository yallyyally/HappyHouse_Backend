package com.ssafy.vue.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.NoticeMapper;
import com.ssafy.vue.dto.NoticeDto;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private SqlSession nDao;
	
	@Override
	public void insertNotice(NoticeDto noticeDto) {
		nDao.getMapper(NoticeMapper.class).insertNotice(noticeDto);
	}

	@Override
	public List<NoticeDto> getNoticeList() {
		return nDao.getMapper(NoticeMapper.class).getNoticeList();
	}

	@Override
	public NoticeDto readNotice(int num) {
		return nDao.getMapper(NoticeMapper.class).readNotice(num);
	}

	@Override
	public void deleteNotice(int num) {
		nDao.getMapper(NoticeMapper.class).deleteNotice(num);
	}

	@Override
	public void updateNotice(int num, NoticeDto noticeDto) {
		 nDao.getMapper(NoticeMapper.class).updateNotice(num,noticeDto);
	}


}
