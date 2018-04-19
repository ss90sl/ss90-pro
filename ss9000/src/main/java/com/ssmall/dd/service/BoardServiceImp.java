package com.ssmall.dd.service;

import java.util.List;

import javax.inject.Inject;

import com.ssmall.dd.dao.BoardDAO;
import com.ssmall.dd.dto.BoardVO;

public class BoardServiceImp implements BoardService {

	@Inject
	BoardDAO bDao;
	
	@Override
	public void insert_Board_content(BoardVO bVo) {
		bDao.board_insert(bVo);
	}

	@Override
	public List<BoardVO> show_item_content(int no) {return bDao.board_select_one(1, no);}

	@Override
	public List<BoardVO> show_dev_content(int no) {return bDao.board_select_one(0, no);}

	@Override
	public List<BoardVO> use_item_content(int no) {return bDao.board_select_one(no);}
	
	@Override
	public List<BoardVO> show_reply_content(int m_no, int c_no, int b_no) {return bDao.board_select_one(c_no, m_no, b_no);}

	
	@Override
	public void delete_Board_content(int no) {
		// TODO Auto-generated method stub

	}

	
}
