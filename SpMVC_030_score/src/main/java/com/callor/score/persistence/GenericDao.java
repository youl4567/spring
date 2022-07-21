package com.callor.score.persistence;

import java.util.List;

public interface GenericDao<VO, ID> {

	public List<VO> selectAll();
	public VO fineById(ID id);
	public int insert(VO vo);
	public int update(VO vo);
	public int delete(ID id);
}
