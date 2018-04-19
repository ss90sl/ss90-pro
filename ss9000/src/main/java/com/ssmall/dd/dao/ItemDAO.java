package com.ssmall.dd.dao;

import java.util.List;

import com.ssmall.dd.dto.CartVO;
import com.ssmall.dd.dto.ItemVO;

public interface ItemDAO {
	List<ItemVO> i_n();
	List<ItemVO> i_b();
	List<ItemVO> i_c_n(int c_no);
	List<ItemVO> s_c_best(int c_no);
	List<ItemVO> select_list(String str);
	List<ItemVO> select_item(int no);
	
	CartVO m_cart(int no);
	
	int insert(ItemVO iVo);
	int update(ItemVO iVo);
	int dalete(int no);
	
	int itemEA();
	
	
}
