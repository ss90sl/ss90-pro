package com.ssmall.dd.dao;

import java.util.List;

import com.ssmall.dd.dto.BoardVO;
import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.ItemVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

public interface SsMallDAO {
	
	//�ε��� ����
	List<ItemVO> show_index_new();
	List<ItemVO> show_index_best();
	List<ItemVO> show_index_c_outer();
	List<ItemVO> show_index_c_top();
	List<ItemVO> show_index_c_pants();
	List<ItemVO> show_index_c_shirts();
	
	//ī�װ��� ���� ������ ����Ʈ
	List<ItemVO> show_c_best(int c_no);
	List<ItemVO> show_c_list(int c_no);
	
	//��ǰ ��
	//��ǰ����
	List<ItemVO> show_item(int no);
	//��ǰ����
	List<BoardVO> item_post_list(int no);
	
	//��ǰ �亯 ��� 
	List<BoardVO> item_post(int no);
	List<BoardVO> item_post_reply(int no);
	
	
	//�ŷ�����
	List<DevVO> Dev_List(int no);
	//�ŷ�������
	List<DevVO> Dev_info(int no);
	
	
	//ȸ��
	//�α���
	int loginChk(String id, String pwd);
	//ȸ������
	void singup(MemberVO mVo);
	//���������
	List<M_infoVO> minfo(String id);
	
	//��ٱ��� ���
	List<ItemVO> cartlist(String no);
	
	
	
	
	
}
