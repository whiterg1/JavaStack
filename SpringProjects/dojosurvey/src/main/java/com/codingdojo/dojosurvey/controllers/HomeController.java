package com.codingdojo.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/validation", method=RequestMethod.POST)
	public String validation(@RequestParam(value="name")String name, @RequestParam(value="location")String location, @RequestParam(value="language")String language, @RequestParam(value="comments")String comments) {
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
		
}
