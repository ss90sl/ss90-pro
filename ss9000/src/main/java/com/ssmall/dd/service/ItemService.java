package com.ssmall.dd.service;

import java.util.List;

import com.ssmall.dd.dto.ItemVO;

public interface ItemService {
	
	//�ε���
	//��ȯ ����������
	public List<ItemVO> show_index_new();
	public List<ItemVO> show_index_best();
	public List<ItemVO> show_index_c_outer();
	public List<ItemVO> show_index_c_top();
	public List<ItemVO> show_index_c_pants();
	public List<ItemVO> show_index_c_shirts();
	
	//ī�װ�
	public List<ItemVO> show_c_best(int cno);
	public List<ItemVO> show_c_list(int cno);
	
	//�����ۼ���
	public List<ItemVO> show_item(int no);
	
	//��ٱ��� ����Ʈ
	public List<ItemVO> show_cart_list(int no);
	
	
	//admin
	//������ �߰�,����,����
	public int i_insert(ItemVO iVo);
	public int i_update(ItemVO iVo);
	public int i_delete(int no);
	
	
	
	
	
}
