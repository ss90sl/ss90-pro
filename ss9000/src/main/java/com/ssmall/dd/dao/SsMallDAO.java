package com.ssmall.dd.dao;

import java.util.List;

import com.ssmall.dd.dto.BoardVO;
import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.ItemVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

public interface SsMallDAO {
	
	//인덱스 구성
	List<ItemVO> show_index_new();
	List<ItemVO> show_index_best();
	List<ItemVO> show_index_c_outer();
	List<ItemVO> show_index_c_top();
	List<ItemVO> show_index_c_pants();
	List<ItemVO> show_index_c_shirts();
	
	//카테고리별 개별 페이지 리스트
	List<ItemVO> show_c_best(int c_no);
	List<ItemVO> show_c_list(int c_no);
	
	//상품 상세
	//상품정보
	List<ItemVO> show_item(int no);
	//상품문의
	List<BoardVO> item_post_list(int no);
	
	//상품 답변 댓글 
	List<BoardVO> item_post(int no);
	List<BoardVO> item_post_reply(int no);
	
	
	//거래내역
	List<DevVO> Dev_List(int no);
	//거래내역상세
	List<DevVO> Dev_info(int no);
	
	
	//회원
	//로그인
	int loginChk(String id, String pwd);
	//회원가입
	void singup(MemberVO mVo);
	//고객정보출력
	List<M_infoVO> minfo(String id);
	
	//장바구니 출력
	List<ItemVO> cartlist(String no);
	
	
	
	
	
}
