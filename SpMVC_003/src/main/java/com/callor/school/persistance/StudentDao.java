package com.callor.school.persistance;

import com.callor.school.model.StudentVO;

/*
 * GenericDao 를 상속받으면서
 * StudentVO 와 Strinf type 을 Generic 으로 사용하였다.
 * 결국 GenericDao 에 선언된 method 들은
 * 여기에서 Generic type 으로 선언한 StudentVO와 String 타입을 갖는
 * 메서드를 자동으로 구현하게 된다.
 */
public interface StudentDao extends GenericDao<StudentVO, String> {


	
}
