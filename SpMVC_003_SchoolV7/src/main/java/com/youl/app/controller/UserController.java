package com.youl.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youl.app.model.UserVO;
import com.youl.app.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// @RequestMapping(value = "/user")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return null;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO userVO, HttpSession session, Model model) {
		// 로그인 폼에서 입력한 username, password 는 userVO에 담겨
		// 이곳에 도착한다
		log.debug(userVO.toString());

		// Server 와 view 사이에서 약속된 Protocol 을 사용하기 위하여
		// 변수를 선언하고
		String loginMessage = null;

		// 로그인 폼에서 전송된 데이터중 username 으로
		// findById() 즉 SelectOne(username) 을 실행한다
		// 그리고 결과를 loginUserVO 에 담는다
		// 만약 username 정보가 user table 에 없으면
		// 결과는 null 이고,
		// 정보가 있으면 관련데이터가 포함된 vo 가 만들어진다
		UserVO loginUserVO = userService.findById(userVO.getUsername());

		// username 이 가입된 적이 없을때
		if (loginUserVO == null) {
			// 가입된 적이 없다는 Key word 를 생성하고
			loginMessage = "USERNAME FAIL";
		} else // else if
		// username 은 있는데 password 가 다를 경우
		if (!loginUserVO.getPassword().equals(userVO.getPassword())) {
			// 비밀번호가 잘못되었다는 Key word 를 생성하고
			loginMessage = "PASSWORD FAIL";
		}

		// 로그인 되었는지 그렇지 않은지 세션에 setting
		if (loginMessage == null) {
			session.setAttribute("USER", loginUserVO);
		} else {
			session.removeAttribute("USER");
		}

		// view 로 보낼 message Protocol 을 setting
		model.addAttribute("LOGIN_MESSAGE", loginMessage);
		return "user/login_ok";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");

		/*
		 * redirect: 로그아웃이 끝나면 web browser 의 주소창에 /user/login 을 입력하고 Enter 를 눌러라
		 */
		return "redirect:/user/login";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		/*
		 * 이 메서를 요청하는 url 은 /user/join 이다
		 * 
		 * return null 을 실행하면 return user/join 을 실행한 것과 같다 views/user/join.jsp 를
		 * rendering 하라는 의미
		 */

		return null;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO userVO) {

		log.debug("JOIN");
		log.debug(userVO.toString());
		userService.join(userVO);

		return "redirect:/user/login";
	}

	@ResponseBody
	@RequestMapping(value = "/idcheck/{username:.+}", method = RequestMethod.GET)
	public String idcheck(@PathVariable String username) {

		UserVO userVO = userService.findById(username);
		if (userVO == null) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

}
