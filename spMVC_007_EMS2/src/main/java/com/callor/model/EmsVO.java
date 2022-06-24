package com.callor.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmsVO {

	private long e_seq;
	private String e_from_email;
	
	@Email(message = "Email 형식이 아닙니다.")
	@NotEmpty(message = "받는사람 Email은 반드시 입력하세요")
	private String e_to_email;
	
	@NotNull(message = "보내는 사람 이름은 null일 수 없습니다.")
	private String e_from_name;
	
	@Length(min = 1, max = 100, message="받는 사람 이름은 1~100글자까지만 가능")
	@NotEmpty(message = "받는사람 이름은 반드시 입력하세요")
	private String e_to_name;
	
	@NotEmpty(message = "제목을 입력하세요")
	private String e_subject;
	private String e_content;
	
	
	@Size(min=1, max = 10, message = "num 은 1부터 10 사이 값이어야 합니다.")
	private String e_sendDate;
	private String e_send_time;
	
	@Min(value=1, message="num 은 1보다 커야합니다.")
	@Max(value=10, message="num 은 10보다 작아야 합니다.")
	private int num;
	
	private int decimal;
}









