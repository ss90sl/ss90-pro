package com.ssmall.dd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssmall.dd.dto.BoardVO;

@Repository
public class BoardDAOImp implements BoardDAO {
	
	@Autowired
	SqlSession ss;
	
	String mp = "board_mapper";
	BoardVO sVo = new BoardVO();

	@Override
	public void board_insert(BoardVO bVo) {ss.insert(mp+".insert_board",bVo);}

	@Override
	public List<BoardVO> board_select_one(int i_no) {return ss.selectList(mp+".select_one",i_no);}

	@Override
	public List<BoardVO> board_select_one(int c_no, int m_no) {
		sVo.setC_no(c_no);
		sVo.setM_no(m_no);
		return ss.selectList(mp+".select_two",sVo);
	}

	@Override
	public List<BoardVO> board_select_one(int c_no, int m_no, int b_no) {
		sVo.setB_no(b_no);
		sVo.setC_no(c_no);
		sVo.setM_no(m_no);
		return ss.selectList(mp+".select_thr",sVo);

	}

}
