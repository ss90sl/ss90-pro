package com.ssmall.dd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssmall.dd.dto.BoardVO;
import com.ssmall.dd.dto.DevVO;
import com.ssmall.dd.dto.ItemVO;
import com.ssmall.dd.dto.M_infoVO;
import com.ssmall.dd.dto.MemberVO;

@Repository
public class SsmallDAOImpl implements SsMallDAO{

	
	@Autowired
	SqlSession ss;
	
	String mp = "item_mapper";
	
	//index구성
	@Override
	public List<ItemVO> show_index_new() { return ss.selectList(mp+".index_new_item"); }

	@Override
	public List<ItemVO> show_index_best() { return ss.selectList(mp+".index_best_item"); }

	@Override
	public List<ItemVO> show_index_c_outer() { return ss.selectList(mp+".index_c_o");}

	@Override
	public List<ItemVO> show_index_c_top() {return ss.selectList(mp+".index_c_t");}

	@Override
	public List<ItemVO> show_index_c_pants() {return ss.selectList(mp+".index_c_p");}

	@Override
	public List<ItemVO> show_index_c_shirts() {return ss.selectList(mp+".index_c_s");}

	
	//카테고리별
	@Override
	public List<ItemVO> show_c_best(int c_no) {return ss.selectList(mp+".item_page_best", c_no);}

	@Override
	public List<ItemVO> show_c_list(int c_no) {return ss.selectList(mp+".item_page_list", c_no);}

	@Override
	public int loginChk(String id, String pwd) {
		
		return 0;
	}

	@Override
	public void singup(MemberVO mVo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<M_infoVO> minfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemVO> show_item(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> item_post_list(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> item_post(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> item_post_reply(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DevVO> Dev_List(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DevVO> Dev_info(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemVO> cartlist(String no) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//

}
