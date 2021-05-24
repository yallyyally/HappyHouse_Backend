package com.ssafy.vue.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.ssafy.vue.dto.BaseaddrDto;
import com.ssafy.vue.dto.CultureDto;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.PopulationDto;
import com.ssafy.vue.dto.SearchHouseDealDto;

public interface TownService {

	public List<PopulationDto> getPopulationInfo(String selectedGu);

	public BaseaddrDto getGuPosition(String selectedGu);

	public List<CultureDto> getCulturalPlace(String selectedGu);
}
