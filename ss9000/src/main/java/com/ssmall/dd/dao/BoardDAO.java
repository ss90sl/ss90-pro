package com.ssmall.dd.dao;

import java.util.List;

import com.ssmall.dd.dto.BoardVO;

public interface BoardDAO {
	void board_insert(BoardVO bVo);
	
	
	//�Խù�
	//�����۹�ȣ��
	List<BoardVO> board_select_one(int i_no);
	//ī�װ�, �����
	List<BoardVO> board_select_one(int c_no,int m_no);
	
	//����
	List<BoardVO> board_select_one(int c_no,int m_no,int b_no);
	
	
	
	
	
}
