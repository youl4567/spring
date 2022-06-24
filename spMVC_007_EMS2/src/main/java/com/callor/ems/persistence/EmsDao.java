package com.callor.ems.persistence;

import com.callor.model.EmsVO;
import com.callor.model.GenericDao;

public interface EmsDao extends GenericDao<EmsVO, Long> {
	
	public void create_ems_table();

}
