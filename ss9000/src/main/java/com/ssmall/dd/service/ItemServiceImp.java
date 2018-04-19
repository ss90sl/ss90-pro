package com.ssmall.dd.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ssmall.dd.dao.ItemDAO;
import com.ssmall.dd.dto.CartVO;
import com.ssmall.dd.dto.ItemVO;


@Service
public class ItemServiceImp implements ItemService{

	@Inject
	private ItemDAO iDao;

	
	@Override
	public List<ItemVO> show_index_new() {return iDao.i_n();}

	@Override
	public List<ItemVO> show_index_best() {return iDao.i_b();}

	@Override
	public List<ItemVO> show_index_c_outer() {return iDao.i_c_n(0);}

	@Override
	public List<ItemVO> show_index_c_top() {return iDao.i_c_n(1);}

	@Override
	public List<ItemVO> show_index_c_pants() {return iDao.i_c_n(2);}

	@Override
	public List<ItemVO> show_index_c_shirts() {return iDao.i_c_n(3);}

	
	@Override
	public List<ItemVO> show_c_best(int cno) {
		return iDao.s_c_best(cno);
	}

	@Override
	public List<ItemVO> show_c_list(int cno) {
		String str;
		str = cno+" order by sale desc";
		return iDao.select_list(str);
	}

	@Override
	public List<ItemVO> show_item(int no) {
		return iDao.select_item(no);
	}

	@Override
	public List<ItemVO> show_cart_list(int no) {
		List<ItemVO> clist = new ArrayList<ItemVO>(); 
		int item_no;
		CartVO cart = iDao.m_cart(no);
		String[] item_list = cart.getP_item().split("/");
		for(int i=0; i < item_list.length ; i++) {
			item_no = Integer.parseInt(item_list[i]);
			clist = iDao.select_item(item_no);
		}
		return clist;
	}

	@Override
	public int i_insert(ItemVO iVo) {
		int state =0; 
		int itemEA1=0;
		itemEA1 = iDao.itemEA();
		state = iDao.insert(iVo);
		if(itemEA1+1 != state) {
			return 0;
		}
		return state;
	}

	@Override
	public int i_update(ItemVO iVo) {
		iDao.update(iVo);
		return 0;
	}

	@Override
	public int i_delete(int no) {
		iDao.dalete(no);
		if(iDao.select_item(no) == null) {
			return 0;
		}
		return 1;
	}
	
}
