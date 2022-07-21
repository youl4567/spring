package com.callor.score.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.score.model.StudentVO;
import com.callor.score.service.impl.StudentServiceImplV1;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImplV1 studentServiceImplV1;
	
	@RequestMapping(value={"/",""}, method = RequestMethod.GET)
	@ResponseBody
	public List<StudentVO> home() {

		List<StudentVO> stList = studentServiceImplV1.selectAll();
		return stList;
		
	}
 
}
