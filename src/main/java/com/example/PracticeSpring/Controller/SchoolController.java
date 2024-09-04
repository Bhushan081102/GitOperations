package com.example.PracticeSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PracticeSpring.Entity.School;
import com.example.PracticeSpring.Service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService service;

	@GetMapping("hello")
	public String hello() {
		return "I tried my best";
	}
	
	@GetMapping("alldetails")
	public List<School> getdetails(){
		System.out.println("Mapping over");
	//	SchoolService service=new SchoolService();
		return service.getAlldetails();
		
	}
	
	@PostMapping("/adddetails")
	public School addSchoolData(@RequestBody School school){
	//	SchoolService service=new SchoolService();

		return service.AddSchooldetails(school);
		
	}
	
	@PutMapping("/Update")
	public School UpdateSchoolDetails(@RequestBody School school) {
	//	SchoolService service=new SchoolService();

		return service.UpdateSchoolDetails(school);
		
	}
}
