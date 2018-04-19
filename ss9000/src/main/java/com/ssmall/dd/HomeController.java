package com.ssmall.dd;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssmall.dd.dao.SsmallDAOImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	SsmallDAOImpl iDao;
	
	//인덱스
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("newlist", iDao.show_index_new() );
		model.addAttribute("bestlist", iDao.show_index_best() );
		model.addAttribute("list_o", iDao.show_index_c_outer());
		model.addAttribute("list_t", iDao.show_index_c_top());
		model.addAttribute("list_p", iDao.show_index_c_pants());
		model.addAttribute("list_s", iDao.show_index_c_shirts());
		
		return "index";
	}
	
	//카테고리별 페이지
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String shop(@RequestParam int c_no, Model model) {
		
		//model.addAttribute("shopname", c_no);
		model.addAttribute("c_best", iDao.show_c_best(c_no) );
		model.addAttribute("c_list", iDao.show_c_list(c_no) );
		
		return "shop";
	}
	
	//로그인
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		
		return "login";
	}
	
	//로그인체크
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginChk(Model model) {
		
		
		return "loginChk";
	}
	
}
