package com.callor.images.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.images.config.QualifierConfig;
import com.callor.images.model.StartMenuDTO;
import com.callor.images.persistance.SelfitDao;

@Service(QualifierConfig.SERVICE.SELFIT_V2)
public class SelfitServiceImplV2 extends SelfitServiceImplV1 {

	public SelfitServiceImplV2(SelfitDao selfitDao) {
		super(selfitDao);
	}

	@Override
	public void startPage(Model model) {
		
		List<StartMenuDTO> beginMenus = selfitDao.selectByScNum("01");
		List<StartMenuDTO> middleMenus = selfitDao.selectByScNum("02");
		List<StartMenuDTO> advMenus = selfitDao.selectByScNum("03");
		
		
		// 각각 메뉴를 개별적으로 model 에 담기
		model.addAttribute("BEGIN_MENU", beginMenus);
		model.addAttribute("MIDDLE_MENU", middleMenus);
		model.addAttribute("ADV_MENU", advMenus);
		
	}

	@Override
	public void getDaySetList(Model model, String sc_num) {
		
		List<StartMenuDTO> daySetList = selfitDao.selectDaySet(sc_num);
		model.addAttribute("DAYS", daySetList);
		
		
	}
		

}
