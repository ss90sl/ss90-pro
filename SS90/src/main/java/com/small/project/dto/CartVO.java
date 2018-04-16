package com.small.project.dto;

import java.util.Date;

public class CartVO {
	private int no;
	private int m_no;
	private String p_item;
	private Date r_date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getP_item() {
		return p_item;
	}
	public void setP_item(String p_item) {
		this.p_item = p_item;
	}
	public Date getR_date() {
		return r_date;
	}
	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}
	
	
}
