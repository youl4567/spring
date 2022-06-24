package com.callor.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.ems.persistence.EmsDao;
import com.callor.ems.service.EmsService;
import com.callor.model.EmsVO;

@Service
public class EmsServiceImplV1 implements EmsService {
	
	private final EmsDao emsDao;
	

	
	public EmsServiceImplV1(EmsDao emsDao) {
		this.emsDao = emsDao;
	}


	@Autowired
	public void create_ems_table() {

		emsDao.create_ems_table();
	}


	public List<EmsVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public EmsVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public int insert(EmsVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int update(EmsVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
