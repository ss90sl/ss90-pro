package com.ssmall.dd.service;

import java.util.List;

import com.ssmall.dd.dto.BoardVO;

public interface BoardService {
	
	//��ǰ����, 
	//�ۼ�
	//��ǰ����, ��۹���, ��۴亯, ��ǰ�ı�
	public void insert_Board_content(BoardVO bVo);
	
	
	//�������
	//��ǰ����(����������,������������)
	//����
	public List<BoardVO> show_item_content(int no);
	//��۹���(����������)
	public List<BoardVO> show_dev_content(int no);
	
	
	
	
	//��ǰ�ı�(������������)
	public List<BoardVO> use_item_content(int no);
	
	//�亯
	public List<BoardVO> show_reply_content(int m_no,int c_no, int b_no);
	
	
	//����
	public void delete_Board_content(int no); 
	
	
	
	
	
}
