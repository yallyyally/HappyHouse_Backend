package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.BusDto;
import com.ssafy.vue.dto.CameraDto;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.KindergartenDto;
import com.ssafy.vue.dto.PublicBicycleDto;
import com.ssafy.vue.dto.SchoolDto;
import com.ssafy.vue.dto.SearchHouseDealDto;
import com.ssafy.vue.dto.SubwayDto;

public interface HouseService {

	public List<HouseDealDto> getHouseDealList(String dong, String aptname);
	public List<HouseInfoDto> getHouseInfoList();
	public List<HouseInfoDto> searchHouseInfo(SearchHouseDealDto searchHouseDealDto);
	public List<String> getOptionsGu();
	public List<String> getOptionsDong(String selectedGu);
	public List<HouseInfoDto> getHouseInfoByDong(String dongName);
	public List<HouseInfoDto> getHouseInfoByGu(String guName);
	public List<SchoolDto> getSchoolInfo(String selectedGu);
	public List<KindergartenDto> getKindergartenInfo(String selectedGu);
	public List<PublicBicycleDto> getPublicBicycleInfo(String selectedGu);
	public CameraDto getCameraPos(String selectedDong);
	public List<SubwayDto> getSubwayInfo(String selectedGu);
	public List<BusDto> getBusInfo(String selectedGu);
}
