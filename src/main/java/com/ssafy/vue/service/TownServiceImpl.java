package com.ssafy.vue.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.TownMapper;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.PopulationDto;

@Service
public class TownServiceImpl implements TownService {

	@Autowired
	private SqlSession tDao;

	@Override
	public List<PopulationDto> getPopulationInfo(String selectedGu) {
		return tDao.getMapper(TownMapper.class).getPopulationInfo(selectedGu);
	}

}
