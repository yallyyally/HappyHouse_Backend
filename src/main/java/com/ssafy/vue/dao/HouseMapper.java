package com.ssafy.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;

@Mapper
public interface HouseMapper {
	public List<HouseDealDto> getHouseDealList();
	public List<HouseInfoDto> getHouseInfoList();
	public List<HouseDealDto> searchHouseDeal();
	public List<HouseInfoDto> searchHouseInfo();
}
