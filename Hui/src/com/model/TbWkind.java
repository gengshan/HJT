package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbWkind entity. @author MyEclipse Persistence Tools
 */

public class TbWkind implements java.io.Serializable {

	// Fields

	private Integer no;
	private String kind;
	private Integer kindNo;
	private String name;
	private String link;
	private String not;
	private Set tbHotels = new HashSet(0);
	private Set tbKtvs = new HashSet(0);
	private Set tbMovies = new HashSet(0);
	private Set tbFoods = new HashSet(0);
	private Set tbTakes = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbWkind() {
	}

	/** minimal constructor */
	public TbWkind(String kind, Integer kindNo, String name, String link) {
		this.kind = kind;
		this.kindNo = kindNo;
		this.name = name;
		this.link = link;
	}

	/** full constructor */
	public TbWkind(String kind, Integer kindNo, String name, String link,
			String not, Set tbHotels, Set tbKtvs, Set tbMovies, Set tbFoods,
			Set tbTakes) {
		this.kind = kind;
		this.kindNo = kindNo;
		this.name = name;
		this.link = link;
		this.not = not;
		this.tbHotels = tbHotels;
		this.tbKtvs = tbKtvs;
		this.tbMovies = tbMovies;
		this.tbFoods = tbFoods;
		this.tbTakes = tbTakes;
	}

	// Property accessors

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Integer getKindNo() {
		return this.kindNo;
	}

	public void setKindNo(Integer kindNo) {
		this.kindNo = kindNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNot() {
		return this.not;
	}

	public void setNot(String not) {
		this.not = not;
	}

	public Set getTbHotels() {
		return this.tbHotels;
	}

	public void setTbHotels(Set tbHotels) {
		this.tbHotels = tbHotels;
	}

	public Set getTbKtvs() {
		return this.tbKtvs;
	}

	public void setTbKtvs(Set tbKtvs) {
		this.tbKtvs = tbKtvs;
	}

	public Set getTbMovies() {
		return this.tbMovies;
	}

	public void setTbMovies(Set tbMovies) {
		this.tbMovies = tbMovies;
	}

	public Set getTbFoods() {
		return this.tbFoods;
	}

	public void setTbFoods(Set tbFoods) {
		this.tbFoods = tbFoods;
	}

	public Set getTbTakes() {
		return this.tbTakes;
	}

	public void setTbTakes(Set tbTakes) {
		this.tbTakes = tbTakes;
	}

}