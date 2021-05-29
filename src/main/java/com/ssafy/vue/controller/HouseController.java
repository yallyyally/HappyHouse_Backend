package com.ssafy.vue.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
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

import com.ssafy.vue.dto.BusDto;
import com.ssafy.vue.dto.CameraDto;
import com.ssafy.vue.dto.HouseDealDto;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.KindergartenDto;
import com.ssafy.vue.dto.PublicBicycleDto;
import com.ssafy.vue.dto.RouteDto;
import com.ssafy.vue.dto.SchoolDto;
import com.ssafy.vue.dto.SearchHouseDealDto;
import com.ssafy.vue.dto.SubwayDto;
import com.ssafy.vue.service.HouseService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;

import io.swagger.annotations.ApiOperation;

//cors error 방지 - 프론트의 port는 8081, 백엔드의 포트는 9999
//왜이래진짜
@CrossOrigin(origins = { "*" }, maxAge = 6000)

@RestController
@RequestMapping("/api/house")
public class HouseController {

	private static final Logger logger = LoggerFactory.getLogger(HouseController.class);

	@Autowired
	private HouseService houseService;

	// houseinfo 에서 dong, aptname 을 넘겨주면 거기에 해당하는 housedeal 가져옴.
//	프론트에서 요청시
//	const res = await axios.get('https://localhost:9999/housedeal', { params: { aptname: 어쩌꾸, dong:어쩌구} });
	@GetMapping("/housedeal")
	@ApiOperation(value = "매물 목록 반환 - houseinfo에서 넘겨준 dong, aptname 기준으로 (map parameter)")
	public ResponseEntity<List<HouseDealDto>> getHouseDealList(@RequestParam(value = "dong") String dong,
			@RequestParam(value = "aptname") String aptname) {
		logger.debug("getHouseDealList 호출스~");
		dong = dong.substring(1, dong.length() - 1);
		aptname = aptname.substring(1, aptname.length() - 1);
		System.out.println("동이름 " + dong + " 아파트 " + aptname);
		return new ResponseEntity<List<HouseDealDto>>(houseService.getHouseDealList(dong, aptname), HttpStatus.OK);
	}

	// 디폴트 : house info 전체 보여주기
	@GetMapping("/houseinfo")
	@ApiOperation(value = "매물 목록 반환 -  houseinfo 정보 모두.")
	public ResponseEntity<List<HouseInfoDto>> getHouseInfoList() {
		logger.debug("getHouseInfoList 호출스~");

		return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoList(), HttpStatus.OK);
	}

	@GetMapping("/houseinfo/dong/{dongName}")
	@ApiOperation(value = "매물 목록 반환 - 동 이름으로 찾기")
	public ResponseEntity<List<HouseInfoDto>> getHouseInfoByDong(@PathVariable String dongName) {
		return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoByDong(dongName), HttpStatus.OK);
	}

	@GetMapping("/houseinfo/gu/{guName}")
	@ApiOperation(value = "매물목록 반환 - 구 전체 매물")
	public ResponseEntity<List<HouseInfoDto>> getHouseInfoByGu(@PathVariable String guName) {
		return new ResponseEntity<List<HouseInfoDto>>(houseService.getHouseInfoByGu(guName), HttpStatus.OK);
	}

	@GetMapping("/houseinfo/camera/{selectedDong}")
	@ApiOperation(value = "선택된 동의 카메라 위경도 반환")
	public ResponseEntity<CameraDto> getCameraPos(@PathVariable String selectedDong) {
		return new ResponseEntity<CameraDto>(houseService.getCameraPos(selectedDong), HttpStatus.OK);
	}

//	매물 검색~ -> 특정 가격대의 houseinfo 찾기 위해 join 필요.
	@PostMapping("/houseinfo")
	@ApiOperation(value = "매물 목록 검색 - houseinfo, by 가격 (from join housedeal), 동네, 아파트명")
//	서로 data만 주고받는 비동기 통신 -> form 입력해서 axios에서 post로 줄것임.
//	가격정보인 dealamount가 houseinfo에 없고 housedeal 밖에 없음.
//	최소가격 ~ 최대 가격 인자가 필요해서 새로운 vo 인 searchhousedealdto 만듦
	public ResponseEntity<List<HouseInfoDto>> searchHouseInfo(@RequestBody SearchHouseDealDto searchHouseDeal) {
		return new ResponseEntity<List<HouseInfoDto>>(houseService.searchHouseInfo(searchHouseDeal), HttpStatus.OK);
	}

	@GetMapping("/optionsGu")
	@ApiOperation(value = "전체 구 목록 반환")
	public ResponseEntity<List<String>> getOptionsGu() {
		logger.debug("구 목록 호출~");
		return new ResponseEntity<List<String>>(houseService.getOptionsGu(), HttpStatus.OK);
	}

	@GetMapping("/optionsDong/{selectedGu}")
	@ApiOperation(value = "선택된 구에 따른 동 목록 반환 -> null 일 경우 전체")
	public ResponseEntity<List<String>> getOptionsDong(@PathVariable String selectedGu) {
		if (selectedGu.equals("null")) {
			System.out.println("전체 동 가져오기");
		} else {

			System.out.println(selectedGu + "소속 동 가져오기");
		}

		return new ResponseEntity<List<String>>(houseService.getOptionsDong(selectedGu), HttpStatus.OK);

	}

	@GetMapping("/school/{selectedGu}")
	@ApiOperation(value = "구의 학교 정보 반환")
	public ResponseEntity<List<SchoolDto>> getSchoolInfo(@PathVariable String selectedGu) {
		return new ResponseEntity<List<SchoolDto>>(houseService.getSchoolInfo(selectedGu), HttpStatus.OK);
	}

	@GetMapping("/kindergarten/{selectedGu}")
	@ApiOperation(value = "구의 유치원 정보 반환")
	public ResponseEntity<List<KindergartenDto>> getKindergartenInfo(@PathVariable String selectedGu) {
		return new ResponseEntity<List<KindergartenDto>>(houseService.getKindergartenInfo(selectedGu), HttpStatus.OK);
	}

	@GetMapping("/subway/{selectedGu}")
	@ApiOperation(value = "선택된 구의 지하철 정보")
	public ResponseEntity<List<SubwayDto>> getSubwayInfo(@PathVariable String selectedGu) {
		return new ResponseEntity<List<SubwayDto>>(houseService.getSubwayInfo(selectedGu), HttpStatus.OK);
	}

	@GetMapping("/bus/{selectedGu}")
	@ApiOperation(value = "선택된 구의 버스 정보")
	public ResponseEntity<List<BusDto>> getBusInfo(@PathVariable String selectedGu) {
		return new ResponseEntity<List<BusDto>>(houseService.getBusInfo(selectedGu), HttpStatus.OK);
	}

	@GetMapping("/publicbicycle/{selectedGu}")
	@ApiOperation(value = "구의 따릉이 정류장 정보 반환")
	public ResponseEntity<List<PublicBicycleDto>> getPublicBicycleInfo(@PathVariable String selectedGu) {
		return new ResponseEntity<List<PublicBicycleDto>>(houseService.getPublicBicycleInfo(selectedGu), HttpStatus.OK);
	}

	@GetMapping("/route")
	@ApiOperation(value = "두 지점 사이 이동 정보")
	public ResponseEntity<RouteDto> getRouteInfo(@RequestParam("start") String start, @RequestParam("goal") String goal) throws IOException {
//		 url 사용하여 요청 객체 생성
		System.out.println("전해받은 파라미터 " + start+"/"+goal);
		URL url = new URL("https://naveropenapi.apigw.ntruss.com/map-direction-15/v1/driving?start=" + start+"&goal="+goal);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

//		header -> api 키 정보.
		con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", "ynpr8dsf9h");
		con.setRequestProperty("X-NCP-APIGW-API-KEY", "DH66Nok2B5ETB3rgwHoInUktdi8U0ztwlPUAL17I");

//		값을 읽어보자~
		System.out.println("성공? 400뜨면 가만안도" + con.getResponseCode());
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
//		출력하고
		System.out.println("======================");
		System.out.println(content);
//		연결끊기
		in.close();
		con.disconnect();
		
//		데이터를 json으로 파싱해보즈ㅏ
//		에러남: org.json 설치 -> 에러 ->버전문제 해결 -> 에러: 메이븐 업데이트.
		JSONObject jObject = new JSONObject(content.toString());

		jObject = jObject.getJSONObject("route");
		
//		에러: obj가 아니구 array
//		jObject = jObject.getJSONObject("traoptimal");
		JSONArray tmp =jObject.getJSONArray("traoptimal");

		jObject = tmp.getJSONObject(0).getJSONObject("summary");
		
//		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		이동시간, 이동거리, 톨게이트 요금, 택시 요금 파싱!
//		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		int duration = jObject.getInt("duration");
		System.out.println("이동시간 "+duration);
		
		int distance = jObject.getInt("distance");
		System.out.println("이동거리 "+distance);
		
		int tollFare = jObject.getInt("tollFare");

		System.out.println("톨게이트욕므 "+tollFare);
		
		int taxiFare = jObject.getInt("taxiFare");
		System.out.println("택시비 "+taxiFare);
		
		int fuelPrice = jObject.getInt("fuelPrice");
		System.out.println("연료비 "+fuelPrice);
		
		
		RouteDto routeDto = new RouteDto(duration,distance,taxiFare,fuelPrice);
		return new ResponseEntity<RouteDto>(routeDto, HttpStatus.OK);


	}
}
