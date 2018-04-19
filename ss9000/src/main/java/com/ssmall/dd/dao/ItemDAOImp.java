package com.ssmall.dd.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssmall.dd.dto.CartVO;
import com.ssmall.dd.dto.ItemVO;

@Repository
public class ItemDAOImp implements ItemDAO{
	
	@Autowired
	SqlSession ss;
	
	String mp = "item_mapper";

	@Override
	public List<ItemVO> i_n() {return ss.selectList(mp+".index_new_item");}
	@Override
	public List<ItemVO> i_b() {return ss.selectList(mp+".index_best_item");}
	@Override
	public List<ItemVO> i_c_n(int c_no) {return ss.selectList(mp+".index_c_o", c_no);}
	
	@Override
	public List<ItemVO> s_c_best(int c_no) {return ss.selectList(mp+".item_page_best", c_no);}
	
	@Override
	public List<ItemVO> select_list(String str) {return ss.selectList(mp+".select_list", str);}
	@Override
	public List<ItemVO> select_item(int no) {return ss.selectList(mp+".select_one", no);}
	@Override
	public CartVO m_cart(int no) {return ss.selectOne(mp+".select_c_one",no);}
	@Override
	public int insert(ItemVO iVo) {return ss.insert(mp+".insert_item",iVo);}
	@Override
	public int update(ItemVO iVo) {ss.update(mp+".update_item",iVo);return 0;}
	@Override
	public int dalete(int no) {ss.delete(mp+".delete_item"+no);return 0;
	}
	@Override
	public int itemEA() {return ss.selectOne(mp+".itemEA");}
	
	

}
