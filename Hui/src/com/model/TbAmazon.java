package com.model;

/**
 * TbAmazon entity. @author MyEclipse Persistence Tools
 */

public class TbAmazon implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String tit;
	private String pri1;
	private String pri2;
	private String sal;

	// Constructors

	/** default constructor */
	public TbAmazon() {
	}

	/** minimal constructor */
	public TbAmazon(String img, String lin, String tit, String pri1) {
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.pri1 = pri1;
	}

	/** full constructor */
	public TbAmazon(TbWkind tbWkind, String img, String lin, String tit,
			String pri1, String pri2, String sal) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.pri1 = pri1;
		this.pri2 = pri2;
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

	public String getTit() {
		return this.tit;
	}

	public void setTit(String tit) {
		this.tit = tit;
	}

	public String getPri1() {
		return this.pri1;
	}

	public void setPri1(String pri1) {
		this.pri1 = pri1;
	}

	public String getPri2() {
		return this.pri2;
	}

	public void setPri2(String pri2) {
		this.pri2 = pri2;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

}