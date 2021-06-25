package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	DojoRepository dojoRepository;
	
	//Create a Dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	//Displays all Dojos
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
	
	//Displays Dojo by Id
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	
    public Dojo updateDojo(Long id, String name) {
    	Optional<Dojo> optionalDojo = dojoRepository.findById(id);
    	if(optionalDojo.isPresent()) {
    		Dojo dojo = optionalDojo.get();
    		dojo.setName(name);
    	return dojoRepository.save(dojo);
    	}else {
    		return null;
    	}
    }
	
    public void deleteDojo(Long id) {
    	dojoRepository.deleteById(id);
    }
}
