package com.lk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.Component.WhatFuck;
import com.lk.Model.HelloMessage;


@RestController
public class RootRestController {

	@Autowired
	WhatFuck wf;
	
	@RequestMapping("/fuck")
	public String ff()
	{
		return wf.sayFuck();
	}
	
	
	@RequestMapping("/message")
	public String zc(@ModelAttribute HelloMessage hs, Model model) {
		return hs.getName();
	}
}
