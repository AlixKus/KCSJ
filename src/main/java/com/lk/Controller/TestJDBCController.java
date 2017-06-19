package com.lk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lk.Service.StudentService;

@Controller
public class TestJDBCController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/getSt")
	public String getStus(Model model) {
		model.addAttribute("students", studentService.getListDao());
		return "Students";
	}
	
	@RequestMapping("/getStSc")
	public String getStSCs(Model model) {
		model.addAttribute("students", studentService.getStScList());
		return "StudentAndTeacher";
	}
}
