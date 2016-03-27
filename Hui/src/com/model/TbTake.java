package com.model;

/**
 * TbTake entity. @author MyEclipse Persistence Tools
 */

public class TbTake implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbWkind tbWkind;
	private String img;
	private String lin;
	private String nam;
	private String sal;
	private String gra;
	private String spr;
	private String dfe;
	private String dti;
	private String lab;

	// Constructors

	/** default constructor */
	public TbTake() {
	}

	/** minimal constructor */
	public TbTake(TbWkind tbWkind, String img, String lin, String nam) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.nam = nam;
	}

	/** full constructor */
	public TbTake(TbWkind tbWkind, String img, String lin, String nam,
			String sal, String gra, String spr, String dfe, String dti,
			String lab) {
		this.tbWkind = tbWkind;
		this.img = img;
		this.lin = lin;
		this.nam = nam;
		this.sal = sal;
		this.gra = gra;
		this.spr = spr;
		this.dfe = dfe;
		this.dti = dti;
		this.lab = lab;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getGra() {
		return this.gra;
	}

	public void setGra(String gra) {
		this.gra = gra;
	}

	public String getSpr() {
		return this.spr;
	}

	public void setSpr(String spr) {
		this.spr = spr;
	}

	public String getDfe() {
		return this.dfe;
	}

	public void setDfe(String dfe) {
		this.dfe = dfe;
	}

	public String getDti() {
		return this.dti;
	}

	public void setDti(String dti) {
		this.dti = dti;
	}

	public String getLab() {
		return this.lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

}