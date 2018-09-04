package com.easyui.domain;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private Integer id;//表示树的id
	private String text;//表示树的名称
	private String state;//closed表示树闭合
	private Integer parentId;//表示树的父节点
	private List<TreeNode> children = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
