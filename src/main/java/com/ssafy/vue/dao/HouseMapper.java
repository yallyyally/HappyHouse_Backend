package com.ssafy.vue.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.SearchHouseDealDto;

@Mapper
public interface HouseMapper {
	public List<HouseDealDto> getHouseDealList(Map map);
	public List<HouseInfoDto> getHouseInfoList();
	public List<HouseDealDto> searchHouseDeal(SearchHouseDealDto searchHouseDealDto);
}
