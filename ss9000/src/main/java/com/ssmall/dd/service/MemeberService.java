package com.ssmall.dd.service;

import java.util.List;

import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

public interface MemeberService {
	
	//회원가입, 정보변경, 탈퇴
	public int m_insert(MemberVO mVo);
	public int m_update(MemberVO mVo);
	public int m_delete(int no);

	//아이디 중복 체크
	public boolean idchk(String id);
	//로그인체크
	public int login(String id, String pwd);
	
	//비밀번호 암호화
	public String sha256_pw(String pwd);
	
	
	
	//회원 정보
	public M_infoVO m_info(int no);
	
	
	
	
	//회원 장바구니
	//카트 변경
	public void cart_update(int m_no, int i_no);
	
	
	
	
	//회원 결제 내역
	//결제 및 주문 정보
	public List<DevVO> dev_info(int no);

	
	
	
	
}
