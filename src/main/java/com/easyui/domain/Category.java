package com.easyui.domain;

public class Category {
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
