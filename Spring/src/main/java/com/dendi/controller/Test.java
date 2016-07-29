package com.dendi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dendi.entity.Student;

@Controller
public class Test {
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name", name);
		System.out.println(name);
		return "success";
	}
	@RequestMapping("/helllo")
	public String hello1(String name, Model model) {
		model.addAttribute("name", name);
		System.out.println("hello1");
		System.out.println(name);
		return "success";
	}

	@RequestMapping("/login/{name}/")
	public String login(@PathVariable("name") String username) {
		System.out.println("xxxxxxx");
		return "success";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {

	System.out.println(student.getName());
		return "success";
	}
	@RequestMapping(value = "/addStuden1t", method = RequestMethod.POST)
	public String addStudent1( Student student, ModelMap model) {
		System.out.println("addStuden1t");
	System.out.println(student.getName());
		return "success";
	}
}
