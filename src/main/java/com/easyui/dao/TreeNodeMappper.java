package com.easyui.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.easyui.domain.TreeNode;

public interface TreeNodeMappper {
	@Select("select * from tree_node")
	List<TreeNode> getList();
	
	@Insert("insert into tree_node(id, text, parentId) values(#{id}, #{text}, #{parentId})")
	void add(TreeNode node);
	
    @Update("UPDATE tree_node SET text=#{text},parentId=#{parentId} WHERE id=#{id}")
    void updateNode(TreeNode node);

}