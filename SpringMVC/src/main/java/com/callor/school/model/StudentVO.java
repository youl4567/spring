package com.callor.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StudentVO {

	private String stnum;
	private String stname;
	private String sttel;
	private String staddr;
	private String stdept;
	private String stgrade;
	
}
