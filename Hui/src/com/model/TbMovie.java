package com.model;

/**
 * TbMovie entity. @author MyEclipse Persistence Tools
 */

public class TbMovie implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String lin;
	private String img;
	private String nam;
	private Double gra;
	private String lab;

	// Constructors

	/** default constructor */
	public TbMovie() {
	}

	/** minimal constructor */
	public TbMovie(TbWkind tbWkind, String lin, String img, String nam) {
		this.tbWkind = tbWkind;
		this.lin = lin;
		this.img = img;
		this.nam = nam;
	}

	/** full constructor */
	public TbMovie(TbWkind tbWkind, String lin, String img, String nam,
			Double gra, String lab) {
		this.tbWkind = tbWkind;
		this.lin = lin;
		this.img = img;
		this.nam = nam;
		this.gra = gra;
		this.lab = lab;
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

	public String getLin() {
		return this.lin;
	}

	public void setLin(String lin) {
		this.lin = lin;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getNam() {
		return this.nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public Double getGra() {
		return this.gra;
	}

	public void setGra(Double gra) {
		this.gra = gra;
	}

	public String getLab() {
		return this.lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

}