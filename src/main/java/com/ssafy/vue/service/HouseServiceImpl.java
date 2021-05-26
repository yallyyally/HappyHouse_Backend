package com.ssafy.vue.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.HouseMapper;
import com.ssafy.vue.dto.BusDto;
import com.ssafy.vue.dto.CameraDto;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.KindergartenDto;
import com.ssafy.vue.dto.PublicBicycleDto;
import com.ssafy.vue.dto.SchoolDto;
import com.ssafy.vue.dto.SearchHouseDealDto;
import com.ssafy.vue.dto.SubwayDto;

@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private SqlSession hdao;
	
	@Override
	public List<HouseDealDto> getHouseDealList(String dong, String aptname) {
		Map map = new HashMap<String, String>();
		map.put("dong", dong);
		map.put("aptname", aptname);
		return hdao.getMapper(HouseMapper.class).getHouseDealList(map);
	}

	@Override
	public List<HouseInfoDto> getHouseInfoList() {
		return hdao.getMapper(HouseMapper.class).getHouseInfoList();
	}

	@Override
	public List<HouseInfoDto> searchHouseInfo(SearchHouseDealDto searchHouseDealDto) {
		return hdao.getMapper(HouseMapper.class).searchHouseInfo(searchHouseDealDto);
	}

	@Override
	public List<String> getOptionsGu() {
		return hdao.getMapper(HouseMapper.class).getOptionsGu();
	}

	@Override
	public List<String> getOptionsDong(String selectedGu) {
		if(selectedGu.equals("null"))
			return hdao.getMapper(HouseMapper.class).getAllOptionsDong();
		else
			return hdao.getMapper(HouseMapper.class).getOptionsDong(selectedGu);
	}

	@Override
	public List<HouseInfoDto> getHouseInfoByDong(String dongName) {
		return hdao.getMapper(HouseMapper.class).getHouseInfoByDong(dongName);
	}

	@Override
	public List<HouseInfoDto> getHouseInfoByGu(String guName) {
		return hdao.getMapper(HouseMapper.class).getHouseInfoByGu(guName);
	}

	@Override
	public List<SchoolDto> getSchoolInfo(String selectedGu) {
		return hdao.getMapper(HouseMapper.class).getSchoolInfo(selectedGu);
	}

	@Override
	public List<KindergartenDto> getKindergartenInfo(String selectedGu) {
		return hdao.getMapper(HouseMapper.class).getKindergartenInfo(selectedGu);
	}
	
	@Override 
	public CameraDto getCameraPos(String selectedDong) {
		return hdao.getMapper(HouseMapper.class).getCameraPos(selectedDong);
	}

	@Override
	public List<PublicBicycleDto> getPublicBicycleInfo(String selectedGu) {
		return hdao.getMapper(HouseMapper.class).getPublicBicycleInfo(selectedGu);
	}	
	public List<SubwayDto> getSubwayInfo(String selectedGu) {
		return hdao.getMapper(HouseMapper.class).getSubwayInfo(selectedGu);
	}
	public List<BusDto> getBusInfo(String selectedGu) {
		return hdao.getMapper(HouseMapper.class).getBusInfo(selectedGu);
	}


}
