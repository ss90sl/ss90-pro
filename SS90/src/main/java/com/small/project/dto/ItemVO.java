package com.small.project.dto;

import java.util.Date;

public class ItemVO {
	private int no;
	private int c_no;
	private String name;
	private String img_i;
	private String img_c;
	private String img_m1;
	private String img_m2;
	private int s_price;
	private int g_price;
	private int ea;
	private int return_ea;
	
	
	public String getImg_i() {
		return img_i;
	}
	public void setImg_i(String img_i) {
		this.img_i = img_i;
	}
	public String getImg_c() {
		return img_c;
	}
	public void setImg_c(String img_c) {
		this.img_c = img_c;
	}
	public String getImg_m1() {
		return img_m1;
	}
	public void setImg_m1(String img_m1) {
		this.img_m1 = img_m1;
	}
	public String getImg_m2() {
		return img_m2;
	}
	public void setImg_m2(String img_m2) {
		this.img_m2 = img_m2;
	}
	private int sale_ea;
	private Date r_date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getS_price() {
		return s_price;
	}
	public void setS_price(int s_price) {
		this.s_price = s_price;
	}
	public int getG_price() {
		return g_price;
	}
	public void setG_price(int g_price) {
		this.g_price = g_price;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public int getReturn_ea() {
		return return_ea;
	}
	public void setReturn_ea(int return_ea) {
		this.return_ea = return_ea;
	}
	public int getSale_ea() {
		return sale_ea;
	}
	public void setSale_ea(int sale_ea) {
		this.sale_ea = sale_ea;
	}
	public Date getR_date() {
		return r_date;
	}
	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}
	
	

}
