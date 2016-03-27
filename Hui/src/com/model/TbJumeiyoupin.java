package com.model;

/**
 * TbJumeiyoupin entity. @author MyEclipse Persistence Tools
 */

public class TbJumeiyoupin implements java.io.Serializable {

	// Fields

	private Integer no;
	private TbWkind tbWkind;
	private String img;
	private String lin;

	// Constructors

	/** default constructor */
	public TbJumeiyoupin() {
	}

	/** minimal constructor */
	public TbJumeiyoupin(String img, String lin) {
		this.img = img;
		this.lin = lin;
	}

	/** full constructor */
	public TbJumeiyoupin(TbWkind tbWkind, String img, String lin) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
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

}