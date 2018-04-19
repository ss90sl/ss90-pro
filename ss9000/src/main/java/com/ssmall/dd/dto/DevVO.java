package com.ssmall.dd.dto;

import java.util.Date;

public class DevVO {
	private int no;
	private int m_no;
	private String items;
	private Date chk_date;
	private int state;
	private String dc_c;
	
	public String getDc_c() {
		return dc_c;
	}
	public void setDc_c(String dc_c) {
		this.dc_c = dc_c;
	}
	private int i_no;
	private String addr;
	
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
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Date getChk_date() {
		return chk_date;
	}
	public void setChk_date(Date chk_date) {
		this.chk_date = chk_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getI_no() {
		return i_no;
	}
	public void setI_no(int i_no) {
		this.i_no = i_no;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
