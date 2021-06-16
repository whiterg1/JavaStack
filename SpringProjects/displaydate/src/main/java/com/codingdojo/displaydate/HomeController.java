package com.codingdojo.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("EEEEEEEEE, 'the' dd 'of' MMMMMMMMMM, YYYY");
		model.addAttribute("date", formatDate.format(date));
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		SimpleDateFormat formatTime = new SimpleDateFormat("K':'mm a");
		model.addAttribute("time", formatTime.format(time));
		return "time.jsp";
	}
}
