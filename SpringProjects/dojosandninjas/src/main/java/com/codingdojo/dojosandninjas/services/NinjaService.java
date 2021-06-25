package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	NinjaRepository ninjaRepository;
	
	//Create a Language
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	//Displays all ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
	
	//Displays Ninja by Id
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}else {
			return null;
		}
	}
	
    public Ninja updateNinja(Long id, String firstName, String lastName, int age, Dojo dojo) {
    	Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
    	if(optionalNinja.isPresent()) {
    		Ninja ninja = optionalNinja.get();
    		ninja.setFirstName(firstName);
    		ninja.setLastName(lastName);
    		ninja.setAge(age);
    		ninja.setDojo(dojo);
    	return ninjaRepository.save(ninja);
    	}else {
    		return null;
    	}
    }
	
    public void deleteNinja(Long id) {
    	ninjaRepository.deleteById(id);
    }
}
