package com.codingdojo.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping(value="/process_form")
	public String validation(
			@RequestParam(value="name")String name, 
			@RequestParam(value="location")String location, 
			@RequestParam(value="language")String language, 
			@RequestParam(value="comments")String comments,
			HttpSession session) {
		
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comments", comments);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("location", session.getAttribute("location"));
		model.addAttribute("language", session.getAttribute("language"));
		model.addAttribute("comments", session.getAttribute("comments"));
		
		String language = (String) session.getAttribute("language");
		if( language.equals("Java")){
			return "java.jsp";
		}else {
			return "result.jsp";
		}
	}
		
}
