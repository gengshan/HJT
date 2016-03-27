package com.model;

/**
 * TbHotel entity. @author MyEclipse Persistence Tools
 */

public class TbHotel implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String nam;
	private String pla;
	private String des;
	private String lab;
	private String pri;
	private String spr;
	private String gra;
	private String sal;

	// Constructors

	/** default constructor */
	public TbHotel() {
	}

	/** minimal constructor */
	public TbHotel(TbWkind tbWkind, String img, String lin, String nam) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.nam = nam;
	}

	/** full constructor */
	public TbHotel(TbWkind tbWkind, String img, String lin, String nam,
			String pla, String des, String lab, String pri, String spr,
			String gra, String sal) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.nam = nam;
		this.pla = pla;
		this.des = des;
		this.lab = lab;
		this.pri = pri;
		this.spr = spr;
		this.gra = gra;
		this.sal = sal;
	}

	// Property accessors

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public TbWkind getTbWkind() {
		return this.tbWkind;
	}

	public void setTbWkind(TbWkind tbWkind) {
		this.tbWkind = tbWkind;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLin() {
		return this.lin;
	}

	public void setLin(String lin) {
		this.lin = lin;
	}

	public String getNam() {
		return this.nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getPla() {
		return this.pla;
	}

	public void setPla(String pla) {
		this.pla = pla;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getLab() {
		return this.lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public String getPri() {
		return this.pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}

	public String getSpr() {
		return this.spr;
	}

	public void setSpr(String spr) {
		this.spr = spr;
	}

	public String getGra() {
		return this.gra;
	}

	public void setGra(String gra) {
		this.gra = gra;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

}