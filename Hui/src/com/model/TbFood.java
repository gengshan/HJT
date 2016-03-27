package com.model;

/**
 * TbFood entity. @author MyEclipse Persistence Tools
 */

public class TbFood implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String nam;
	private String kin;
	private String pla;
	private String des;
	private String lab;
	private Double pri;
	private Double spr;
	private String con;

	// Constructors

	/** default constructor */
	public TbFood() {
	}

	/** minimal constructor */
	public TbFood(TbWkind tbWkind, String img, String lin, String nam,
			String kin, String pla, Double pri) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.nam = nam;
		this.kin = kin;
		this.pla = pla;
		this.pri = pri;
	}

	/** full constructor */
	public TbFood(TbWkind tbWkind, String img, String lin, String nam,
			String kin, String pla, String des, String lab, Double pri,
			Double spr, String con) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.nam = nam;
		this.kin = kin;
		this.pla = pla;
		this.des = des;
		this.lab = lab;
		this.pri = pri;
		this.spr = spr;
		this.con = con;
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

	public String getKin() {
		return this.kin;
	}

	public void setKin(String kin) {
		this.kin = kin;
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

	public Double getPri() {
		return this.pri;
	}

	public void setPri(Double pri) {
		this.pri = pri;
	}

	public Double getSpr() {
		return this.spr;
	}

	public void setSpr(Double spr) {
		this.spr = spr;
	}

	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
	}

}