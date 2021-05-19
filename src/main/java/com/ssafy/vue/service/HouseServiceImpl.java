package com.ssafy.vue.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.HouseMapper;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.SearchHouseDealDto;

@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private SqlSession hdao;
	
	@Override
	public List<HouseDealDto> getHouseDealList() {
		return hdao.getMapper(HouseMapper.class).getHouseDealList();
	}

	@Override
	public List<HouseInfoDto> getHouseInfoList() {
		return hdao.getMapper(HouseMapper.class).getHouseInfoList();
	}

	@Override
	public List<HouseDealDto> searchHouseDeal(SearchHouseDealDto searchHouseDealDto) {
		return hdao.getMapper(HouseMapper.class).searchHouseDeal(searchHouseDealDto);
	}


}
