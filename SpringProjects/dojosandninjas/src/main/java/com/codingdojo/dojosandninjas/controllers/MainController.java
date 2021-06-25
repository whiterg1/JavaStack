package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class MainController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String newDojo(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "dojocreate.jsp";
	}

    @PostMapping(value="/dojos/new/process")
    public String create(
    						@Valid 
    					 @ModelAttribute("dojo") Dojo dojo, 
    					 BindingResult result) {
    	if(result.hasErrors()) {
    		System.out.println(result.getFieldErrors());
    		return "dojocreate.jsp";
    	}else {
    		Dojo newDojo = dojoService.createDojo(dojo);
    		return "redirect:/dojos/"+ newDojo.getId();
    	}
    }
    
    @GetMapping("/ninjas/new")
    public String createNinja( Model model) {
    	model.addAttribute("ninja", new Ninja());
    	model.addAttribute("dojos", dojoService.allDojos());
    	
    	return "ninjacreate.jsp";
    }
    
    @PostMapping(value="/ninjas/process")
    	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
    	if(result.hasErrors()) {
    		return "ninjacreate.jsp";
    	}else {
    		Ninja newNinja = ninjaService.createNinja(ninja);
    		return "redirect:/dojos/"+ newNinja.getDojo().getId();
    	}
    }
    @GetMapping("/dojos/{id}")
    	public String displayDojos(@PathVariable Long id, Model model) {
    	model.addAttribute("dojo", dojoService.findDojo(id));
    	model.addAttribute("ninjas", dojoService.findDojo(id).getNinjas());
        return "dojodisplay.jsp";
    }
}