package com.easyui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.easyui.domain.Book;

public interface BookMapper {
	@Select("SELECT book.ID,book.AUTHOR,book.`NAME`,book.PRICE,book.PUBLISH_DATE,book.SUMMARY,category.`NAME` FROM `book` INNER JOIN category ON  CATEGORY_ID = category.ID")
	List<Book> getList();
	
}
