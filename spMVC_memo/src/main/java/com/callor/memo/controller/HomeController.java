package com.callor.memo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.memo.model.MemoVO;
import com.callor.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@Autowired
	private MemoService memoService;
	
	// 메모 리스트 보여주기
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		memoService.create_memo_table();
		
		List<MemoVO> memoList = memoService.selectAll();
		model.addAttribute("memo", memoList);

		return "home";
	}
	
	// 메모 추가하기
	@RequestMapping(value="/m_write", method=RequestMethod.GET)
	public String memo_write(Model model) {
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		MemoVO memoVO = MemoVO.builder()
				.m_date(dayFormat.format(date))
				.m_time(timeFormat.format(date))
				.build();
		model.addAttribute("memo", memoVO);
	
		return "/m_write";
	}
	
	@RequestMapping(value="/m_write", method=RequestMethod.POST)
	public String memo_write(MemoVO memoVO) {
		
		memoService.insert(memoVO);
	
		return "redirect:/";
	}
	
	
	// 상세보기 페이지
	@RequestMapping(value="/{m_seq}/detail", method=RequestMethod.GET)
	public String memo_detail(@PathVariable("m_seq") long m_seq, Model model) {

		
		MemoVO memoVO = memoService.findByID(m_seq);
		model.addAttribute("memo", memoVO);
		
		return "/detail";
	}
	
	// 메모 삭제하기
	@RequestMapping(value="{m_seq}/delete", method = RequestMethod.GET)
	public String memo_delete(@PathVariable("m_seq") long m_seq) {
		
		memoService.delete(m_seq);
		return "redirect:/";
	}
	
	// 메모 수정하기
	@RequestMapping(value="/{m_seq}/update", method=RequestMethod.GET)
	public String memo_update(@PathVariable("m_seq") long m_seq, Model model) {

		
		MemoVO memoVO = memoService.findByID(m_seq);
		model.addAttribute("memo", memoVO);
		
		return "/m_write";
	}
	
	@RequestMapping(value="/{m_seq}/update", method=RequestMethod.POST)
	public String memo_update(@PathVariable("m_seq") long m_seq, Model model, MemoVO memoVO) {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		memoVO.setM_date(dayFormat.format(date));
		memoVO.setM_time(timeFormat.format(date));
		memoService.update(memoVO);
		
		 model.addAttribute("memo", memoVO);
		
		String retStr = String.format("redirect:/%s/detail", memoVO.getM_seq());
		return retStr;
	}

}
