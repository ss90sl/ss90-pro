package com.ssmall.dd.service;

import java.security.MessageDigest;
import java.util.List;

import javax.inject.Inject;

import com.ssmall.dd.dao.ItemDAO;
import com.ssmall.dd.dao.MemberDAO;
import com.ssmall.dd.dto.CartVO;
import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

public class MemberServiceImp implements MemeberService{

	@Inject
	private MemberDAO mDao;
	
	@Inject
	private ItemDAO iDao;
	
	@Override
	public int m_insert(MemberVO mVo) {
		String pwd_sha256 = sha256_pw(mVo.getPwd());
		mVo.setPwd(pwd_sha256);
		return mDao.insert(mVo);
	}

	@Override
	public int m_update(MemberVO mVo) {
		return mDao.update(mVo);
	}

	@Override
	public int m_delete(int no) {
		return mDao.delete(no);
	}

	@Override
	public M_infoVO m_info(int no) {
		return mDao.minfo2(no);
	}



	@Override
	public void cart_update(int m_no, int i_no) {
		CartVO cVo;
		String newP_item ="";
		cVo = iDao.m_cart(m_no);
		
		
		if(cVo.getR_date() == null) {
		long rdate = cVo.getR_date().getTime() + 604803870;
		long todate =  mDao.sysdate().getTime();
			if(rdate <= todate ) {
				mDao.cart_delete(m_no);
			}
		}
		if(cVo.getP_item() == null) {
			cVo.setM_no(m_no);
			cVo.setP_item(i_no+"");
			mDao.cart_insert(cVo);
		}else {
			String[] list = cVo.getP_item().split(",");
			for(int i=0;i<list.length;i++) {
				if(list[i] == i_no+"") {
					continue;
				}
				newP_item += list[i]+",";
			}
			newP_item += i_no+"";
			cVo.setP_item(newP_item);
			mDao.cart_update(cVo);
		}
	}



	@Override
	public List<DevVO> dev_info(int no) {
		return mDao.dev_list(no);
	}

	@Override
	public boolean idchk(String id) {
		boolean chk = false;
		MemberVO mVo = mDao.minfo1(id);
		if(mVo.getId() != null) {
			chk = true; 
		}
		return chk;
	}

	@Override
	public int login(String id, String pwd) {
		//0 아이디없음
		//1 비번다름
		//2 로그인
		int chk = 0;
		MemberVO mVo = mDao.minfo1(id);
		if(mVo.getId() == null) {
			if(mVo.getPwd().equals(sha256_pw(pwd))) {
				chk=2;
			}
			chk=1;
		}
		return chk;
	}

	@Override
	public String sha256_pw(String pwd) {
		String str=null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] bArr = md.digest(pwd.getBytes());//암호화.쪼개기(문자열.바이트배열로);
			StringBuffer sb = new StringBuffer();
			for (byte b : bArr) {
				sb.append(Integer.toString(b&0xff, 16));
				// byte는 00~FF(0~255)까지를 저장
				// 자바에서는 byte가 -128~127 까지
				//(0~127까지는 아스키코드를따라가고,128은 -128, 129는 -127로 대응됨)
			}
			str = sb.toString().toUpperCase(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str; 
	}

}
