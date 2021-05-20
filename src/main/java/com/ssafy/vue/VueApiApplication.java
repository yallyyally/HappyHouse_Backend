package com.ssafy.vue;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.ssafy.vue.interceptor.JwtInterceptor;

@SpringBootApplication
public class VueApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueApiApplication.class, args);
	}

	@Autowired
    private JwtInterceptor jwtInterceptor;
	
	// JWTInterceptor를 설치
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtInterceptor).addPathPatterns("/member/**") // 기본 적용 경로
//              .excludePathPatterns(Arrays.asList("/member/confirm/**","/member/regist","/member/delete","/member/update", "/board/list"));// 적용 제외 경로
				.excludePathPatterns(Arrays.asList("/**"));// 모든경로
	}
}
