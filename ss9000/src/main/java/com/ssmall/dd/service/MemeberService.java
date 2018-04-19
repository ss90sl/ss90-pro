package com.ssmall.dd.service;

import java.util.List;

import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

public interface MemeberService {
	
	//ȸ������, ��������, Ż��
	public int m_insert(MemberVO mVo);
	public int m_update(MemberVO mVo);
	public int m_delete(int no);

	//���̵� �ߺ� üũ
	public boolean idchk(String id);
	//�α���üũ
	public int login(String id, String pwd);
	
	//��й�ȣ ��ȣȭ
	public String sha256_pw(String pwd);
	
	
	
	//ȸ�� ����
	public M_infoVO m_info(int no);
	
	
	
	
	//ȸ�� ��ٱ���
	//īƮ ����
	public void cart_update(int m_no, int i_no);
	
	
	
	
	//ȸ�� ���� ����
	//���� �� �ֹ� ����
	public List<DevVO> dev_info(int no);

	
	
	
	
}
