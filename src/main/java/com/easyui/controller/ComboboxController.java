package com.easyui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyui.domain.Category;

@RestController
public class ComboboxController {
	@RequestMapping("/combobox")
    public List<Category> combobox() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1, "图书"));
		list.add(new Category(2, "音像"));
		list.add(new Category(3, "美妆"));
		return list;
    }

	
}
