package com.callor.hello.controller;


/*
 * 정적(static) 패턴
 * 문자열을 통하여 어떤 것을 구분하는 코드가 필요할 때
 * 문자열을 직접 사용하면 오타 등으로 인하여 Run time Exception 이 발생할 수 있다.
 * Run time Exception 은 찾기가 원인을 찾기가 어려운 경우가 많다.
 * 
 * 미리 클래스.static문자열 형태의 변수를 선언해두고
 * 필요할 때, 클래스.static문자열 을 사용하는 것
 * 
 * 코드를 작성하는 과정에서 좀 더 빨리 오류를 발견할 수 있다.
 */
public class QualifyConfig {

	public final static String HOME_SERVICE_V1 = "homeServiceV1";
	public final static String HOME_SERVICE_V2 = "homeServiceV2";
	public final static String HOME_SERVICE_V3 = "homeServiceV3";
}
