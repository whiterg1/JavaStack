package com.codingdojo.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String verify(@RequestParam(value="input") String input) {
		String code = "bushido";
		if(input.equals(code)) {
			return "code.jsp";
		}else {
			return "redirect:/tryharder";
		}
	}
	
	@RequestMapping("/tryharder")
	public String validationFail(RedirectAttributes notWarrior) {
		notWarrior.addFlashAttribute("train", "You Must Train Harder!");
		return "redirect:/";
	}
}

