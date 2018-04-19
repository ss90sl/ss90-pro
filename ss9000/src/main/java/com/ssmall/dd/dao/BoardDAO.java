package com.ssmall.dd.dao;

import java.util.List;

import com.ssmall.dd.dto.BoardVO;

public interface BoardDAO {
	void board_insert(BoardVO bVo);
	
	
	//게시물
	//아이템번호만
	List<BoardVO> board_select_one(int i_no);
	//카테고리, 등록인
	List<BoardVO> board_select_one(int c_no,int m_no);
	
	//리플
	List<BoardVO> board_select_one(int c_no,int m_no,int b_no);
	
	
	
	
	
}
