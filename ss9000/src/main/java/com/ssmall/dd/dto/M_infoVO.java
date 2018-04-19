package com.ssmall.dd.dto;

import java.util.Date;

public class M_infoVO {
	private int no;
	private int m_no;
	private int m_level;
	private int total_m;
	private int total_m_m;
	private Date last_s;
	private Date last_j;
	private char coupon;
	
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
	
	public int getM_level() {
		return m_level;
	}
	public void setM_level(int m_level) {
		this.m_level = m_level;
	}
	public int getTotal_m() {
		return total_m;
	}
	public void setTotal_m(int total_m) {
		this.total_m = total_m;
	}
	public int getTotal_m_m() {
		return total_m_m;
	}
	public void setTotal_m_m(int total_m_m) {
		this.total_m_m = total_m_m;
	}
	public Date getLast_s() {
		return last_s;
	}
	public void setLast_s(Date last_s) {
		this.last_s = last_s;
	}
	public Date getLast_j() {
		return last_j;
	}
	public void setLast_j(Date last_j) {
		this.last_j = last_j;
	}
	public char getCoupon() {
		return coupon;
	}
	public void setCoupon(char coupon) {
		this.coupon = coupon;
	}
	
	
	
}
