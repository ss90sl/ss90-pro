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
	
	//�ε���
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
	
	//ī�װ��� ������
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String shop(@RequestParam("cn") int c_no, Model model) {
		
		//model.addAttribute("shopname", c_no);
		model.addAttribute("c_best", is.show_c_best(c_no) );
		model.addAttribute("c_list", is.show_c_list(c_no) );
		
		return "shop";
	}
	
	//�����ۺ� ������
	@RequestMapping(value = "/shop/item", method = RequestMethod.GET)
	public String item(@RequestParam("in") int i_no, Model model) {
		
		//model.addAttribute("shopname", c_no);
		model.addAttribute("item_info", is.show_item(i_no) );
		
		return "item";
	}
	
	
	//�α���
	//�α���������
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		
		return "login";
	}
	//�α���üũ������
	@RequestMapping(value = "/loginchk", method = RequestMethod.POST)
	public String loginchk(@RequestParam("id") String id,
			@RequestParam("pwd") String pwd, Model model) {
		
		model.addAttribute("result", ms.login(id, pwd));
		
		return "loginchk";
	}
	
	//ȸ������
	@RequestMapping(value = "/singup", method = RequestMethod.GET)
	public String signup(Model model) {
		
		return "sigup";
	}
	
	//���̵�üũ
	@RequestMapping(value = "/idchk", method = RequestMethod.GET)
	public void idchk(@RequestParam("id") String id, HttpServletResponse response) throws IOException {
		if(ms.idchk(id)) {
			response.getWriter().print(0);//����
		}else {
			response.getWriter().print(1);//�Ұ���
		}
		
	}
	
	
	//ȸ������
	@RequestMapping(value = "/singup", method = RequestMethod.POST)
	public String signup_post(MemberVO mVo) {
		ms.m_insert(mVo);
		return "redirect:/";
	}
	
	
	//����������
	
	//�Խù�Ȯ��
	
	
	
	//����
	//item ����
	//����Ʈ
	//�߰�
	
	//����
	
	//����
	
	
	//��۰���
	//�����������(��ۿ�û)
	
	
}
