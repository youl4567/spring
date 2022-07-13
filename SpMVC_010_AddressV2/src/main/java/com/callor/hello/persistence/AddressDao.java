package com.callor.hello.persistence;

import com.callor.hello.model.AddressVO;

public interface AddressDao {

	public String selectAll(AddressVO vo);
	public int findeBySeq(long ad_seq);
	public int insert(AddressVO vo);
	public int update(AddressVO vo);
	public int delete(AddressVO vo);
}
