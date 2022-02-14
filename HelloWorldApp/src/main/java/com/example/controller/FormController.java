package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView newPage(ModelAndView model) {
	    model.addObject("title", "new");
	    model.addObject("message", "Input your name");
	    model.setViewName("form");
	    return model;
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String createPage(@RequestParam("name") String name, Model model) {
		model.addAttribute("title", "create");
		model.addAttribute("message", "Hello " + name + "!");
		model.addAttribute("name", name);
		return "form";
	}
}