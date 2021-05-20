package com.ssafy.vue.service;

import java.util.List;

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
	public void deleteNotice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNotice() {
		// TODO Auto-generated method stub

	}

}
