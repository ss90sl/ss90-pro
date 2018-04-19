package com.ssmall.dd.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssmall.dd.dto.CartVO;
import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

@Repository
public class MemberDAOImp implements MemberDAO {

	@Autowired
	SqlSession ss;
	
	String mp = "member_mapper";
	
	@Override
	public MemberVO minfo1(String id) {return ss.selectOne(mp+".select_one",id);}

	@Override
	public int insert(MemberVO mVo) {return ss.insert(mp+".insert_mem",mVo);}

	@Override
	public int update(MemberVO mVo) {return ss.update(mp+".update_mem",mVo);}

	@Override
	public int delete(int no) {return ss.delete(mp+".delete_mem",no);}

	@Override
	public M_infoVO minfo2(int no) {return ss.selectOne(mp+".select_minfo",no);}

	@Override
	public void cart_insert(CartVO cVo) {ss.insert(mp+".cart_insert",cVo);}

	@Override
	public void cart_update(CartVO cVo) {ss.update(mp+".cart_update",cVo);}

	@Override
	public void cart_delete(int no) {ss.delete(mp+".cart_delete",no);}

	@Override
	public List<DevVO> dev_list(int m_no) {return ss.selectList(mp+".select_dev",m_no);}
	
	@Override
	public Date sysdate() {return ss.selectOne(mp+".sysdate");
	}

}
