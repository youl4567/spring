package com.callor.memo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemoVO {

	public long m_seq;			// 일련번호 PK
	public String m_author;		// 작성자
	public String m_date;		// 작성일자
	public String m_time;		// 작성시각
	public String m_memo;		// 내용
	public String m_image;		// 이미지파일
	
}
