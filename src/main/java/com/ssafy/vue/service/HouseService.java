package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;

public interface HouseService {

	public List<HouseDealDto> getHouseDealList();
	public List<HouseInfoDto> getHouseInfoList();
	public List<HouseDealDto> searchHouseDeal();
	public List<HouseInfoDto> searchHouseInfo();
}
