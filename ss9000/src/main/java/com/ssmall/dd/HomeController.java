package com.ssmall.dd;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssmall.dd.dto.MemberVO;
import com.ssmall.dd.service.BoardService;
import com.ssmall.dd.service.ItemService;
import com.ssmall.dd.service.MemeberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	
	@Autowired
	ItemService is;
	BoardService bs;
	MemeberService ms;
	
	//인덱스
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("newlist", is.show_index_new() );
		model.addAttribute("bestlist", is.show_index_best() );
		model.addAttribute("list_o", is.show_index_c_outer());
		model.addAttribute("list_t", is.show_index_c_top());
		model.addAttribute("list_p", is.show_index_c_pants());
		model.addAttribute("list_s", is.show_index_c_shirts());
		
		return "index";
	}
	
	//카테고리별 페이지
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String shop(@RequestParam("cn") int c_no, Model model) {
		
		//model.addAttribute("shopname", c_no);
		model.addAttribute("c_best", is.show_c_best(c_no) );
		model.addAttribute("c_list", is.show_c_list(c_no) );
		
		return "shop";
	}
	
	//아이템별 페이지
	@RequestMapping(value = "/shop/item", method = RequestMethod.GET)
	public String item(@RequestParam("in") int i_no, Model model) {
		
		//model.addAttribute("shopname", c_no);
		model.addAttribute("item_info", is.show_item(i_no) );
		
		return "item";
	}
	
	
	//로그인
	//로그인페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		
		return "login";
	}
	//로그인체크페이지
	@RequestMapping(value = "/loginchk", method = RequestMethod.POST)
	public String loginchk(@RequestParam("id") String id,
			@RequestParam("pwd") String pwd, Model model) {
		
		model.addAttribute("result", ms.login(id, pwd));
		
		return "loginchk";
	}
	
	//회원가입
	@RequestMapping(value = "/singup", method = RequestMethod.GET)
	public String signup(Model model) {
		
		return "sigup";
	}
	
	//아이디체크
	@RequestMapping(value = "/idchk", method = RequestMethod.GET)
	public void idchk(@RequestParam("id") String id, HttpServletResponse response) throws IOException {
		if(ms.idchk(id)) {
			response.getWriter().print(0);//가능
		}else {
			response.getWriter().print(1);//불가능
		}
		
	}
	
	
	//회원가입
	@RequestMapping(value = "/singup", method = RequestMethod.POST)
	public String signup_post(MemberVO mVo) {
		ms.m_insert(mVo);
		return "redirect:/";
	}
	
	
	//마이페이지
	
	//게시물확인
	
	
	
	//어드민
	//item 관리
	//리스트
	//추가
	
	//수정
	
	//삭제
	
	
	//배송관리
	//배송정보변경(배송요청)
	
	
}
