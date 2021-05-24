package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.PopulationDto;
import com.ssafy.vue.dto.SearchHouseDealDto;

public interface TownService {

	public List<PopulationDto> getPopulationInfo(String selectedGu);
}
