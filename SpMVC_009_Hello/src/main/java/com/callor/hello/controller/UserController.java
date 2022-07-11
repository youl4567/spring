package com.callor.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
	//	return "join";
	// views/user/join.jsp 를 렌더링하여 클라이언트에게 응답
		return null;
	}

	/*
	 * 일반적인 Controller 의 method 에서 문자열 또는 null 값을 리턴하면
	 * *.jsp 파일을 렌더링하여 응답하라
	 * 
	 * @ResponseBody 가 부착된 Controller 의 method에서 
	 * 문자열을 리턴하면 그 문자열을 클라이언트에게 직접 전달하라는 것
	 */
	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.POST, produces = "text/html;chaset=UTF-8")
	public String join(String username, String password) {
		return username;
	}
	
	
}
