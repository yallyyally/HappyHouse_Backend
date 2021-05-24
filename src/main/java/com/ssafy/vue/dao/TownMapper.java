package com.ssafy.vue.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.BaseaddrDto;
import com.ssafy.vue.dto.CultureDto;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.PopulationDto;
import com.ssafy.vue.dto.SearchHouseDealDto;

@Mapper
public interface TownMapper {

	List<PopulationDto> getPopulationInfo(String selectedGu);

	BaseaddrDto getGuPosition(String selectedGu);

	List<CultureDto> getCulturalPlace(String selectedGu);
	
}
