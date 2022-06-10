package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.UserVO;

public interface UserDao extends GenericDao<UserVO, String>{
	
	
	public List<UserVO> findByName(String name);
	public List<UserVO> findByNickName(String nickName);
	
	/*
	 * username, password  찾기에서 emial을 활용하는 경우가 많기 때문
	 * Email 칼럼을 UNIQUE 로 설정하는 경우가 많다.
	 * 
	 * DB TABLE 의 칼럼이 UNIQUE 라면 칼럼을 조건으로  SELECT 를 했을 때
	 * LIST 가 아닌 VO가 추출될 것이다.
	 * 그렇다면 굳이 메서드의 리턴타입을 List<VO> 로 할 필요는 없다.
	 */
	public UserVO findByEmail(String email);

	public void create_user_table();
}
