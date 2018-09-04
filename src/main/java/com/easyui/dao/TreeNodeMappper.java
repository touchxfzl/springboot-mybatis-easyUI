package com.easyui.dao;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.easyui.domain.TreeNode;

public interface TreeNodeMappper {
	@Select("select * from tree_node")
	List<TreeNode> getList();

}