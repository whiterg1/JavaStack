package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private final LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	//Create a Language
	public Language createLanguage(Language lang) {
		return languageRepository.save(lang);
	}
	
	//Displays all Languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	//Displays Language by Id
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}else {
			return null;
		}
	}
	
    public Language updateLanguage(Long id, String name, String creator, String version) {
    	Optional<Language> optionalLanguage = languageRepository.findById(id);
    	if(optionalLanguage.isPresent()) {
    		Language language = optionalLanguage.get();
    		language.setName(name);
    		language.setCreator(creator);
    		language.setVersion(version);
    	return languageRepository.save(language);
    	}else {
    		return null;
    	}
    }
	
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
}
