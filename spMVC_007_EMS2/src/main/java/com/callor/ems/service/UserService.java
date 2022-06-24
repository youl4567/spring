package com.callor.ems.service;

import com.callor.ems.persistence.UserDao;
import com.callor.model.UserVO;

public interface UserService extends UserDao {
	
	public int join(UserVO userVO);
	public int join_next(UserVO userVO);

}
