package com.callor.score.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.score.model.StudentVO;
import com.callor.score.persistence.StudentDao;
import com.callor.score.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {

	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<StudentVO> selectAll() {
		// TODO Auto-generated method stub
		return studentDao.selectAll();
	}

	@Override
	public StudentVO fineById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
