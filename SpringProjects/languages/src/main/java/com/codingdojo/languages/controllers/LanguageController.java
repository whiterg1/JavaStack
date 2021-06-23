package com.codingdojo.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	//Create- Form Display/Index Page
    @RequestMapping("/languages")
    public String newLanguage(@ModelAttribute("language")Language language, Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
    	return "index.jsp";
    }
    
    //Create- Validation/Creation Path
    @PostMapping(value="/languages")
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
    	if(result.hasErrors()) {
    		return "index.jsp";
    	}else {
    		languageService.createLanguage(language);
    		return "redirect:/languages";
    	}
    }
    //Read-Get By 
    @GetMapping("/languages/{id}")
    public String getById(@PathVariable Long id, Model model) {
    	Language language = languageService.findLanguage(id);
    	model.addAttribute("language", language);
        return "show.jsp";
    }
   
    @GetMapping(value="/languages/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
    	Language language = languageService.findLanguage(id);
    	model.addAttribute("language", language);
        return "edit.jsp";
    }
    
    @PostMapping(value="/languages/{id}/update")
    	   public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, 
    			   				BindingResult result) {
    	        if (result.hasErrors()) {
    	            return "redirect:/languages/{id}/edit";
    	        } else {
    	        	languageService.updateLanguage(id, language.getName(), language.getCreator(), language.getVersion());
    	            return "redirect:/languages";
    	        }
    	    }

    @GetMapping(value="/languages/{id}/delete")
        public String destroy(@PathVariable("id") Long id) {
            languageService.deleteLanguage(id);
            return "redirect:/languages";
        }
}
    
