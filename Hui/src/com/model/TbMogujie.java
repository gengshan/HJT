package com.model;

/**
 * TbMogujie entity. @author MyEclipse Persistence Tools
 */

public class TbMogujie implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String tit;
	private Double pri;
	private Double opri;
	private Double sav;
	private String par;
	private String sur;

	// Constructors

	/** default constructor */
	public TbMogujie() {
	}

	/** minimal constructor */
	public TbMogujie(String img, String lin, String tit, Double pri) {
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.pri = pri;
	}

	/** full constructor */
	public TbMogujie(TbWkind tbWkind, String img, String lin, String tit,
			Double pri, Double opri, Double sav, String par, String sur) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.pri = pri;
		this.opri = opri;
		this.sav = sav;
		this.par = par;
		this.sur = sur;
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

	public Double getPri() {
		return this.pri;
	}

	public void setPri(Double pri) {
		this.pri = pri;
	}

	public Double getOpri() {
		return this.opri;
	}

	public void setOpri(Double opri) {
		this.opri = opri;
	}

	public Double getSav() {
		return this.sav;
	}

	public void setSav(Double sav) {
		this.sav = sav;
	}

	public String getPar() {
		return this.par;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public String getSur() {
		return this.sur;
	}

	public void setSur(String sur) {
		this.sur = sur;
	}

}