package com.callor.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {
	
	private String st_num;
	private String st_name;
	private String st_dept;
	private int st_gradet;
	private String st_tel;
	private String st_addr;

}
