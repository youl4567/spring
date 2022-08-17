package com.callor.food.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.callor.food.config.FoodConfig;
import com.callor.food.config.QualifierConfig;
import com.callor.food.model.FoodItem;
import com.callor.food.service.FoodService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.FOOD_V1)
public class FoodServiceImplV1 implements FoodService {

	@Override
	public String queryString(String search) {

		String queryString = FoodConfig.API_FULL_URL;
		String encodeParams = null;
		
		try {
			encodeParams = "?" + URLEncoder.encode("ServiceKey", "UTF-8");
			encodeParams += "=" + FoodConfig.SERVICE_KEY;
			
			encodeParams += "&" + URLEncoder.encode("pageNo", "UTF-8");
			encodeParams += "=1";
			
			encodeParams += "&" + URLEncoder.encode("numOfRows", "URF-8");
			encodeParams += "=10";
			
			encodeParams += "&" + URLEncoder.encode("resultType", "UTF-8");
			encodeParams += "=json";
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		queryString += encodeParams;
		log.debug("쿼리 문자열 {}", queryString);
		
		
		return queryString;
	}

	@Override
	public List<FoodItem> getFoodItems(String queryString) {

		URI foodRestURI = null;
		
		try {
			foodRestURI = new URI(queryString);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// API 에 JSON 타입으로 데이터를 요청하기 위한 헤더 생성
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(
				Collections.singletonList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> headerEntity = new HttpEntity<String>("parameter", headers);
		
		// 데이터를 수신하여 VO로 변환하기 위한 객체 선언
		RestTemplate restTemp = new RestTemplate();
		
		// String Type 으로 데이터를 수신하여 어떤 형태로
		// 데이터가 수신되는지 확인하는 절차
		ResponseEntity<String> resString = null;
		resString = restTemp.exchange(foodRestURI, HttpMethod.GET, headerEntity, String.class);
		
		log.debug("=".repeat(100));
		log.debug("{}", resString.getBody());
		log.debug("=".repeat(100));
		
		return null;
	}

}










