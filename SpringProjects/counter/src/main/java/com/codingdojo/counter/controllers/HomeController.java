package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	@RequestMapping("")
	public String index(HttpSession session) {
		Integer counter = (Integer) session.getAttribute("count");		
		if(counter == null){
			counter = 1;
		}else {
			counter ++;
		}
		session.setAttribute("count", counter);
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter() {
		return "Counter.jsp";
	}
}
