package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.dto.BaseaddrDto;
import com.ssafy.vue.dto.CultureDto;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.PopulationDto;
import com.ssafy.vue.dto.SearchHouseDealDto;
import com.ssafy.vue.service.HouseService;
import com.ssafy.vue.service.TownService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.ApiOperation;

//cors error 방지 - 프론트의 port는 8081, 백엔드의 포트는 9999

@CrossOrigin(origins = { "*" }, maxAge = 6000)

@RestController
@RequestMapping("/api/town")
public class TownController {

	private static final Logger logger = LoggerFactory.getLogger(TownController.class);

	@Autowired
	private TownService townService;

	@GetMapping("/population/{selectedGu}")
	@ApiOperation(value = "구의 동별 인구정보 반환")
	public ResponseEntity<List<PopulationDto>> getPopulationInfo(@PathVariable String selectedGu) {
		return new ResponseEntity<List<PopulationDto>>(townService.getPopulationInfo(selectedGu), HttpStatus.OK);
	}
	
	@GetMapping("/gupos/{selectedGu}")
	@ApiOperation(value="구의 대표 위치 하나 반환")
	public ResponseEntity<BaseaddrDto> getGuPosition(@PathVariable String selectedGu){
		return new ResponseEntity<BaseaddrDto>(townService.getGuPosition(selectedGu),HttpStatus.OK);
	}
	
	@GetMapping("/cultural/{selectedGu}")
	@ApiOperation(value="문화공간들 반환")
	public ResponseEntity<List<CultureDto>> getCulturalPlace(@PathVariable String selectedGu){
		return new ResponseEntity<List<CultureDto>>(townService.getCulturalPlace(selectedGu),HttpStatus.OK);
	}
	
//
//	// 디폴트 : house info 전체 보여주기
//	@GetMapping("/houseinfo")
//	@ApiOperation(value = "매물 목록 반환 -  houseinfo 정보 모두.")
//	public ResponseEntity<List<HouseInfoDto>> getHouseInfoList() {
//		logger.debug("getHouseInfoList 호출스~");
//		
//		return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoList(), HttpStatus.OK);
//	}
//	
//	@GetMapping("/houseinfo/dong/{dongName}")
//	@ApiOperation(value="매물 목록 반환 - 동 이름으로 찾기")
//	public ResponseEntity<List<HouseInfoDto>> getHouseInfoByDong(@PathVariable String dongName){
//		 return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoByDong(dongName),HttpStatus.OK);
//	}
//	@GetMapping("/houseinfo/gu/{guName}")
//	@ApiOperation(value="매물목록 반환 - 구 전체 매물")
//	public ResponseEntity<List<HouseInfoDto>> getHouseInfoByGu(@PathVariable String guName){
//		return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoByGu(guName),HttpStatus.OK);
//	}
//	
////	매물 검색~ -> 특정 가격대의 houseinfo 찾기 위해 join 필요.
//	@PostMapping("/houseinfo")
//	@ApiOperation(value = "매물 목록 검색 - houseinfo, by 가격 (from join housedeal), 동네, 아파트명")
////	서로 data만 주고받는 비동기 통신 -> form 입력해서 axios에서 post로 줄것임.
////	가격정보인 dealamount가 houseinfo에 없고 housedeal 밖에 없음.
////	최소가격 ~ 최대 가격 인자가 필요해서 새로운 vo 인 searchhousedealdto 만듦
//	public ResponseEntity<List<HouseInfoDto>> searchHouseInfo(@RequestBody SearchHouseDealDto searchHouseDeal) {
//		return new ResponseEntity<List<HouseInfoDto>>(houseService.searchHouseInfo(searchHouseDeal), HttpStatus.OK);
//	}
//
//	@GetMapping("/optionsGu")
//	@ApiOperation(value = "전체 구 목록 반환")
//	public ResponseEntity<List<String>> getOptionsGu() {
//		logger.debug("구 목록 호출~");
//		return new ResponseEntity<List<String>>(houseService.getOptionsGu(), HttpStatus.OK);
//	}
//
//	@GetMapping("/optionsDong/{selectedGu}")
//	@ApiOperation(value = "선택된 구에 따른 동 목록 반환 -> null 일 경우 전체")
//	public ResponseEntity<List<String>> getOptionsDong(@PathVariable String selectedGu) {
//		if (selectedGu.equals("null")) {
//			System.out.println("전체 동 가져오기");
//		} else
//			System.out.println(selectedGu + "소속 동 가져오기");
//
//		return new ResponseEntity<List<String>>(houseService.getOptionsDong(selectedGu), HttpStatus.OK);
//
//	}
}
