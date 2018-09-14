package com.easyui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyui.domain.Book;
import com.easyui.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("getbooks")
	public List<Book> findList(){
		List<Book> list= bookService.findList();
		return list;
	}
}
