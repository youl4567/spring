package com.callor.ems.service;

import com.callor.model.EmsVO;
import com.callor.model.UserVO;

public interface SendMailService {

	public void sendMail(EmsVO emsVO);
	public void sendMail(EmsVO emsVO, UserVO userVO);
	
	
}
