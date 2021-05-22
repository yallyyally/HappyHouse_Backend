package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.SearchHouseDealDto;

public interface HouseService {

	public List<HouseDealDto> getHouseDealList(String dong, String aptname);
	public List<HouseInfoDto> getHouseInfoList();
	public List<HouseInfoDto> searchHouseInfo(SearchHouseDealDto searchHouseDealDto);
	public List<String> getOptionsGu();
	public List<String> getOptionsDong(String selectedGu);
	public List<HouseInfoDto> getHouseInfoByDong(String dongName);
}
