package com.ssmall.dd.service;

import java.util.List;

import com.ssmall.dd.dto.BoardVO;

public interface BoardService {
	
	//상품문의, 
	//작성
	//상품문의, 배송문의, 배송답변, 상품후기
	public void insert_Board_content(BoardVO bVo);
	
	
	//내용출력
	//상품문의(유저페이지,아이템페이지)
	//유저
	public List<BoardVO> show_item_content(int no);
	//배송문의(유저페이지)
	public List<BoardVO> show_dev_content(int no);
	
	
	
	
	//상품후기(아이템페이지)
	public List<BoardVO> use_item_content(int no);
	
	//답변
	public List<BoardVO> show_reply_content(int m_no,int c_no, int b_no);
	
	
	//삭제
	public void delete_Board_content(int no); 
	
	
	
	
	
}
