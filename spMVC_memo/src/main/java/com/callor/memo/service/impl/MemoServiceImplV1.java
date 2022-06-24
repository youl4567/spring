package com.callor.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.memo.model.MemoVO;
import com.callor.memo.persistence.MemoDao;
import com.callor.memo.service.MemoService;

@Service
public class MemoServiceImplV1 implements MemoService {

	private final MemoDao memoDao;
	
	public MemoServiceImplV1(MemoDao memoDao) {
		this.memoDao = memoDao;
	}
	
	@Override
	@Autowired
	public void create_memo_table() {
		memoDao.create_memo_table();
	}

	@Override
	public List<MemoVO> selectAll() {
		return memoDao.selectAll();
	}

	@Override
	public MemoVO findByID(Long m_seq) {
		return memoDao.findByID(m_seq);
	}

	@Override
	public int insert(MemoVO vo) {
		memoDao.insert(vo);
		return 0;
	}

	@Override
	public int update(MemoVO vo) {

		memoDao.update(vo);
		return 0;
	}

	@Override
	public int delete(Long m_seq) {
		memoDao.delete(m_seq);
		return 0;
	}


}
