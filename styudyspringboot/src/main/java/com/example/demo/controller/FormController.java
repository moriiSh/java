package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String newPage(Model model) {
		System.out.println("new page action");
		model.addAttribute("title", "new");
		model.addAttribute("message", "Input your name");
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String createPage(@RequestParam("name") String name, Model model) {
		model.addAttribute("title", "create");
		model.addAttribute("message", "Hello " + name + "!");
		model.addAttribute("name", name);
		return "form";
	}
}