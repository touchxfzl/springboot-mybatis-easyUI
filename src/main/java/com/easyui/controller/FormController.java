package com.easyui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
	@RequestMapping("/form")
	@ResponseBody
    public String combobox(String name,String birthday,String lang) {
		System.out.println(name);
		System.out.println(birthday);
		System.out.println(lang);
		return "OK";
    }
}
