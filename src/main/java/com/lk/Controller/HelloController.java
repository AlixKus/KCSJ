package com.lk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lk.Model.HelloMessage;

@Controller
public class HelloController {

	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHelloForm(@ModelAttribute HelloMessage helloMessage, Model model) {
		model.addAttribute("helloMessage", helloMessage);
		return "zhuche";
	}

	@RequestMapping(value = "/sayhello", method = RequestMethod.POST)
	public String Message(@ModelAttribute HelloMessage hs, Model model) {
		return "/message";
	}

}
