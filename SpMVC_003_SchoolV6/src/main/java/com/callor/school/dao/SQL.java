package com.callor.school.dao;

public class SQL {

	public static class STUDENT{
		public static final String INSERT
		= " INSERT INTO tbl_student ( " 
						+" stnum,"
						+" stname,"
						+" stdept,"
						+" stgrade,"
						+" sttel,"
						+" staddr"
						+" ) VALUES ( "
						+" #{stnum},"
						+" #{stname},"
						+" #{stdept},"
						+" #{stgrade},"
						+" #{sttel},"
						+" #{staddr})";
		
		public static final String UPDATE = ""
		+" UPDATE SET tbl_student "
		+" stnum		= #{stnum},"
		+" stname		= #{stname},"
		+" stdept		= #{stdept},"
		+" stgrade		= #{stgrade},"
		+" sttel		= #{sttel},"
		+" staddr		= #{staddr}"
		+" WHRER stnum = #{stnum}";

	}
}
