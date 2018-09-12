package com.easyui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.easyui.domain.Category;

@RestController
public class DategridController {
	
	@RequestMapping("category")
	public List<Category> categoryList(@RequestParam(defaultValue="asc")String order){
		List<Category>categories = new ArrayList<>();
		if("asc".equals(order)) {
			categories.add(new Category(4, "小学"));
			categories.add(new Category(5, "中学"));
			categories.add(new Category(6, "大学"));
		}else {
			categories.add(new Category(6, "大学"));
			categories.add(new Category(4, "小学"));
			categories.add(new Category(5, "中学"));

		}


		return categories;
	}
}
