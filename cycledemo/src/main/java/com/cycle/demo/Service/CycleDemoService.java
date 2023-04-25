package com.cycle.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cycle.demo.Repsitory.CycleDemoRepsitory;
import com.cycle.demo.model.CycleDemo;

@Service
public class CycleDemoService {
	@Autowired
	CycleDemoRepsitory cr;
	
	public List<CycleDemo> getAllDetails(){
	 
		return cr.findAll();
		
	}
	public CycleDemo saveDetails(@RequestBody CycleDemo a) {
		
		return cr.save(a);
	}
	public CycleDemo putDetails(@RequestBody CycleDemo b) {
		
		return cr.save(b);
	}

     public void deleteDetails(@PathVariable int x) {
    	 
    	 cr.deleteById(x);
     }

}
	


