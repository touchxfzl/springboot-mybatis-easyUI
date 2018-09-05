package com.easyui.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		return treeNodeService.getList();
	}
	
	@RequestMapping("/edit_tree.json")
	public Map<String, String> edit(TreeNode node){
		Map<String, String> result = new HashMap<>();
		try {
			if(node.getId()==0||node.getId()==null) {
				treeNodeService.addTree(node);
			}else {
				treeNodeService.updataNode(node);
				
			}
			result.put("status", "true");
			result.put("message", "编辑成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("status", "false");
			result.put("message", "编辑失败");
		}
		return result;
	}
	
	@RequestMapping("/delete_tree.json")
	public Map<String, String> deleteNode(Integer[] ids){
		Map<String, String> result = new HashMap<>();
		try {
			treeNodeService.deleteNode(ids);
			result.put("status", "true");
			result.put("message", "删除成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("status", "false");
			result.put("message", "删除失败");
		}
		return result;
	}
}
