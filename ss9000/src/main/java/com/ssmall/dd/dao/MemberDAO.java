package com.ssmall.dd.dao;

import java.util.Date;
import java.util.List;

import com.ssmall.dd.dto.CartVO;
import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

public interface MemberDAO {
	MemberVO minfo1(String id);
	M_infoVO minfo2(int no);
	int insert(MemberVO mVo);
	int update(MemberVO mVo);
	int delete(int no);
	
	void cart_insert(CartVO cVo);
	void cart_update(CartVO cVo);
	void cart_delete(int no);
	
	Date sysdate();
	
	List<DevVO> dev_list(int m_no);
	
}
