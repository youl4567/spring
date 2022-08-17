package com.youl.app.service;

import com.youl.app.model.UserVO;
import com.youl.app.persistence.GenericDao;

public interface UserService extends GenericDao<UserVO, String>{
	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);
}
