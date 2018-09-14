package com.easyui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.dao.BookMapper;
import com.easyui.domain.Book;

@Service
public class BookService {
	@Autowired
	private BookMapper bookMapper;


	public List<Book> findList() {
		List<Book> list = bookMapper.getList();
		return list;
	}

}
