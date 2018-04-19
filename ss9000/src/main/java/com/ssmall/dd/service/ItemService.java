package com.ssmall.dd.service;

import java.util.List;

import com.ssmall.dd.dto.ItemVO;

public interface ItemService {
	
	//인덱스
	//전환 사진아이템
	public List<ItemVO> show_index_new();
	public List<ItemVO> show_index_best();
	public List<ItemVO> show_index_c_outer();
	public List<ItemVO> show_index_c_top();
	public List<ItemVO> show_index_c_pants();
	public List<ItemVO> show_index_c_shirts();
	
	//카테고리
	public List<ItemVO> show_c_best(int cno);
	public List<ItemVO> show_c_list(int cno);
	
	//아이템선택
	public List<ItemVO> show_item(int no);
	
	//장바구니 리스트
	public List<ItemVO> show_cart_list(int no);
	
	
	//admin
	//아이템 추가,변경,삭제
	public int i_insert(ItemVO iVo);
	public int i_update(ItemVO iVo);
	public int i_delete(int no);
	
	
	
	
	
}
