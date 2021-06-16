package com.codingdojo.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String dojo(@PathVariable("location")String location) {
		if(location.equals("dojo")) {
			return "This dojo is awesome!";
		}else if(location.equals("burbank-dojo")){
			return "Burbank Dojo is located in Southern California";
		}else if(location.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}else {
			return "Please enter a dojo location";
		}
 	}

}

