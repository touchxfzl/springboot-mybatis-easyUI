package com.easyui.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.dao.TreeNodeMappper;
import com.easyui.domain.TreeNode;

@Service
public class TreeNodeService {
	
	@Autowired
	private TreeNodeMappper treeNodeMappper;

	public List<TreeNode> getTree() {
		List<TreeNode>  nodes= treeNodeMappper.getList();
		Map<Integer, TreeNode> map = new HashMap<>();
		List<TreeNode> parents = new ArrayList<>();
		for (TreeNode node : nodes) {
			map.put(node.getId(), node);
			if(node.getParentId()==null) {
				parents.add(node);
			}
		}
		
		for (TreeNode node : nodes) {
			TreeNode parent = map.get(node.getParentId());
			if (parent!=null) {
				parent.getChildren().add(node);
			}
		}
		
		return parents;
	}

}
