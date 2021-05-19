package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.SearchHouseDealDto;
import com.ssafy.vue.service.HouseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.ApiOperation;

//cors error 방지 - 프론트의 port는 8081, 백엔드의 포트는 9999

@CrossOrigin(origins = {"*"}, maxAge = 6000)

@RestController
@RequestMapping("/api/house")
public class HouseController {
	
	private static final Logger logger = LoggerFactory.getLogger(HouseController.class);

	@Autowired
	private HouseService houseService;
	
//	매물요청스~
	@GetMapping("/housedeal")
	@ApiOperation(value="매물 목록 반환 - housedeal 모두.")
	public ResponseEntity<List<HouseDealDto>> getHouseDealList() {
		logger.debug("getHouseList 호출스~");
		return new ResponseEntity<List<HouseDealDto>>(houseService.getHouseDealList(),HttpStatus.OK);
	}
	
	@GetMapping("/houseinfo")
	@ApiOperation(value="매물 목록 반환 -  houseinfo 정보 모두.")
	public ResponseEntity<List<HouseInfoDto>> getHouseInfoList() {
		logger.debug("getHouseList 호출스~");
		return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoList(),HttpStatus.OK);
	}
	
//	매물 검색~
	@PostMapping("/housedeal")
	@ApiOperation(value="매물 목록 검색 - housedeal, by 가격 , 동네, 아파트명")
//	서로 data만 주고받는 비동기 통신 -> form 입력해서 axios에서 post로 줄것임.
//	가격정보인 dealamount가 houseinfo에 없고 housedeal 밖에 없음.
//	최소가격 ~ 최대 가격 인자가 필요해서 새로운 vo 인 searchhousedealdto 만듦
	public ResponseEntity<List<HouseDealDto>> searchHouseDeal(@RequestBody SearchHouseDealDto searchHouseDeal){
		return new ResponseEntity<List<HouseDealDto>> (houseService.searchHouseDeal(searchHouseDeal), HttpStatus.OK);
	}
	
	
	
}
