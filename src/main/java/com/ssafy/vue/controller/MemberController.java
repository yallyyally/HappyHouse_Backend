package com.ssafy.vue.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ssafy.vue.dto.MemberDto;
import com.ssafy.vue.help.BooleanResult;
import com.ssafy.vue.service.JwtService;
import com.ssafy.vue.service.MemberService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)

@RestController
@RequestMapping("/api/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberService;

	@Autowired
	private JwtService jwtService;

//	@ApiOperation(value = "로그인 확인", response = Map.class)
	@ApiOperation(value = "로그인 정보 조회 후 성공/실패 여부를 반환한다", response = List.class)
	@PostMapping("/confirm/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody MemberDto member, HttpServletResponse response,
			HttpSession session) {
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = null;
		System.out.println(member);
		try {
			MemberDto loginMember = memberService.login(member);
			if (loginMember != null) {
				// jwt.io에서 확인
				// 로그인 성공 -> 토큰 생성
				String token = jwtService.create(loginMember);
				System.out.println(token);
				System.out.println("@@@@@@@@@@@@@@로그인 토큰@@@@@@@@@@@@@");
				
				logger.trace("로그인 토큰정보 : {}", token);

				// 토큰 정보는 response의 헤더로 보내고 나머지는 Map에 담는다.
				// response.setHeader("auth-token", token);
				resultMap.put("auth-token", token);
				resultMap.put("userid", loginMember.getUserid());
				resultMap.put("username", loginMember.getUsername());
				resultMap.put("status", "success");
				resultMap.put("message","로그인 성공");
				// resultMap.put("data", loginMember);
				status = HttpStatus.ACCEPTED;
			} else {
				resultMap.put("message", "로그인 실패! 아이디와 비밀번호를 확인하세요.");
				status = HttpStatus.ACCEPTED;
			}
		} catch (Exception e) {
			logger.error("로그인 실패 : {}", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}

//	@ApiOperation(value = "회원가입.", response = BooleanResult.class)
	@ApiOperation(value = "회원 정보 등록 후 성공/실패 여부를 반환한다", response = List.class)
	@PostMapping("/regist")
//	public ResponseEntity<BooleanResult> registMember(@RequestBody MemberDto member) throws Exception {
//		logger.info("회원등록" + new Date());
//		logger.info("회원등록" + member);
//		boolean checkRegi = memberService.regist(member);
//		BooleanResult br = new BooleanResult();
//		br.setCheck(checkRegi);
//		br.setName("regist");
//		br.setState("success");
//		logger.info("회원등록 checkRegi " + checkRegi);
//		if (!checkRegi) {
//			br.setCheck(false);
//			br.setName("regist");
//			br.setState("fail");
//			return new ResponseEntity<BooleanResult>(br, HttpStatus.OK);
//		}
//
//		return new ResponseEntity<BooleanResult>(br, HttpStatus.OK);
//	}
	public ResponseEntity<String> registMember(@RequestBody MemberDto member) throws Exception {
		int resultCnt = memberService.regist(member);
		if(resultCnt > 0)
			return new ResponseEntity<String>("success", HttpStatus.OK);
		else
			return new ResponseEntity<String>("fail", HttpStatus.OK);
	}

//	@ApiOperation(value = "회원정보 조회", response = MemberDto.class)
	@GetMapping("/info/{authToken}")
	public ResponseEntity<Map<String, Object>> getInfo(HttpServletRequest req, @PathVariable String authToken) throws JsonProcessingException {
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = HttpStatus.ACCEPTED;
//		System.out.println(req.getHeader("auth-token"));
		System.out.println("@@@@@@@@@@@@문제!@@@@@@@@@@@@@@@@@@@@");
		System.out.println(authToken);
		
//		System.out.println(">>>>>> " + jwtService.get(req.getHeader("auth-token")));
		System.out.println(">>>>>> " + jwtService.get(authToken));
		try {
			// 사용자에게 전달할 정보
			String info = memberService.getServerInfo();
			
//			resultMap.putAll(jwtService.get(req.getHeader("auth-token")));
			resultMap.putAll(jwtService.get(authToken));

			resultMap.put("status", true);
			resultMap.put("info", info);
			status = HttpStatus.ACCEPTED;
		} catch (RuntimeException e) {
			logger.error("정보조회 실패 : {}", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
	
//	@ApiOperation(value = "회원 정보를 반환한다", response = List.class)
//	@GetMapping("/info")
//	public ResponseEntity<Map<String, Object>> getInfo(HttpServletRequest req) {
//		Map<String, Object> resultMap = new HashMap<>();
//		HttpStatus status = HttpStatus.ACCEPTED;
//		System.out.println(">>>>>> " + jwtService.get(req.getHeader("auth-token")));
//		try {
//			resultMap.putAll(jwtService.get(req.getHeader("auth-token")));
//			status = HttpStatus.ACCEPTED;
//		} catch (RuntimeException e) {
//			logger.error("회원정보조회 실패 : {}", e);
//			resultMap.put("message", e.getMessage());
//			status = HttpStatus.INTERNAL_SERVER_ERROR;
//		}
//		
//		return new ResponseEntity<Map<String, Object>>(resultMap, status);
//	}

//	@ApiOperation(value = "회원정보 수정 ", response = BooleanResult.class)
//	@PutMapping("/update")
//	public ResponseEntity<BooleanResult> updateMember(@RequestBody MemberDto member) throws Exception {
//		logger.info("회원 정보 수정 " + new Date());
//		logger.info("회원 정보 수정" + member);
//		boolean checkUpdate = memberService.update(member);
//		BooleanResult br = new BooleanResult();
//		br.setCheck(checkUpdate);
//		br.setName("update");
//		br.setState("success");
//		if (!checkUpdate) {
//			br.setCheck(false);
//			br.setName("regist");
//			br.setState("fail");
//
//			return new ResponseEntity<BooleanResult>(HttpStatus.NO_CONTENT);
//		}
//
//		return new ResponseEntity<BooleanResult>(br, HttpStatus.OK);
//	}
	
	@ApiOperation(value = "회원 정보 수정 후 성공/실패 여부를 반환한다", response = List.class)
	@PutMapping("/update")
	public ResponseEntity<String> updateMember(@RequestBody MemberDto member) throws Exception {
		int resultCnt = memberService.update(member);
		if(resultCnt > 0)
			return new ResponseEntity<String>("success", HttpStatus.OK);
		else
			return new ResponseEntity<String>("fail", HttpStatus.OK);
	}

//	@ApiOperation(value = "회원탈퇴", response = BooleanResult.class)
//	@DeleteMapping("/delete")
//	public ResponseEntity<BooleanResult> deleteMember(@RequestBody String userid) throws Exception {
//		logger.info("회원 정보 삭제 !!!!" + new Date());
//		logger.info("회원 정보 삭제 !!!!" + userid);
//		boolean checkdelete = memberService.delete(userid);
//		BooleanResult br = new BooleanResult();
//		br.setCheck(checkdelete);
//		br.setName("delete");
//		br.setState("success");
//		
//		return new ResponseEntity<BooleanResult>(br, HttpStatus.OK);
//	}
	
	@ApiOperation(value = "회원 정보 삭제 후 성공/실패 여부를 반환한다", response = List.class)
	@DeleteMapping("/delete/{userid}")
	public ResponseEntity<String> deleteMember(@PathVariable String userid) throws Exception {
		System.out.println(userid+"받음");
//		int resultCnt = memberService.delete(member);
		int resultCnt = memberService.delete(userid);
		System.out.println("결과 "+resultCnt);
//		if(resultCnt > 0)
			return new ResponseEntity<String>("success", HttpStatus.OK);
//		else
//			return new ResponseEntity<String>("fail", HttpStatus.OK);
	}
}
