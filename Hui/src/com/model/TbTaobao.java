package com.model;

/**
 * TbTaobao entity. @author MyEclipse Persistence Tools
 */

public class TbTaobao implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String tit;
	private String npri1;
	private String npri2;
	private Double opri;
	private String sal;

	// Constructors

	/** default constructor */
	public TbTaobao() {
	}

	/** minimal constructor */
	public TbTaobao(String img, String lin, String tit, String npri1) {
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.npri1 = npri1;
	}

	/** full constructor */
	public TbTaobao(TbWkind tbWkind, String img, String lin, String tit,
			String npri1, String npri2, Double opri, String sal) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.npri1 = npri1;
		this.npri2 = npri2;
		this.opri = opri;
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

	public String getNpri1() {
		return this.npri1;
	}

	public void setNpri1(String npri1) {
		this.npri1 = npri1;
	}

	public String getNpri2() {
		return this.npri2;
	}

	public void setNpri2(String npri2) {
		this.npri2 = npri2;
	}

	public Double getOpri() {
		return this.opri;
	}

	public void setOpri(Double opri) {
		this.opri = opri;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

}