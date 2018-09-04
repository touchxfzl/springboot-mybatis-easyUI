package com.easyui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyui.domain.TreeNode;
import com.easyui.service.TreeNodeService;

@RestController
public class TreeNodeController {
	@Autowired
	private TreeNodeService treeNodeService;
	
	@RequestMapping("/getTree")
	public List<TreeNode> getTree(){
		System.out.println("获取list");
		return treeNodeService.getTree();
	}
}
