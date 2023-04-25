package com.cycle.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cycle.demo.Service.CycleDemoService;
import com.cycle.demo.model.CycleDemo;

@RestController
public class CycleDemoController {
	
	@Autowired
	CycleDemoService dr;
	
	@GetMapping("/all")
	public List<CycleDemo> allDetails(){
		
		return dr.getAllDetails();
	}
	@PostMapping("/save")
	public CycleDemo saveAll(@RequestBody CycleDemo a) {
		
		return dr.putDetails(a);
	}
	@PutMapping("/put")
	public CycleDemo saveAlll(@RequestBody CycleDemo b) {
		
		return dr.putDetails(b);
		
	}
	@DeleteMapping("/delete/{d}")
	public String delete(@PathVariable int d) {
		
		dr.deleteDetails(d);
		return "Details Deleted";
	}

}
	
	


