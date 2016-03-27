package com.model;

/**
 * TbYihaodian entity. @author MyEclipse Persistence Tools
 */

public class TbYihaodian implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String tit;
	private String dis;
	private Double pri;
	private Double ppri;
	private String sal;

	// Constructors

	/** default constructor */
	public TbYihaodian() {
	}

	/** minimal constructor */
	public TbYihaodian(String img, String lin, String tit, Double pri) {
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.pri = pri;
	}

	/** full constructor */
	public TbYihaodian(TbWkind tbWkind, String img, String lin, String tit,
			String dis, Double pri, Double ppri, String sal) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.tit = tit;
		this.dis = dis;
		this.pri = pri;
		this.ppri = ppri;
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

	public String getDis() {
		return this.dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}

	public Double getPri() {
		return this.pri;
	}

	public void setPri(Double pri) {
		this.pri = pri;
	}

	public Double getPpri() {
		return this.ppri;
	}

	public void setPpri(Double ppri) {
		this.ppri = ppri;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

}