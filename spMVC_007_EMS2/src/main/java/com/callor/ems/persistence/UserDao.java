package com.callor.ems.persistence;

import com.callor.model.GenericDao;
import com.callor.model.UserVO;

/*
 * 
 * Generic type 의 상속
 * Generic 인터페이스를 상속(extends) 하면서 실제 사용할 타입을 명시해주면
 * 마치 새로운 코드를 복제하면서 타입을 지정하는 효과를 발휘한다.
 * 
 */
public interface UserDao extends GenericDao<UserVO, String> {
	
	public void create_user_table();

}
