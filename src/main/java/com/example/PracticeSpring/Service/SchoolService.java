package com.example.PracticeSpring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.PracticeSpring.Entity.School;

@Service
public class SchoolService {

	List<School> list;
	
	public SchoolService() {
		list=new ArrayList<>();
		list.add(new School("School1", "location1"));
		list.add(new School("School2", "location2"));
		list.add(new School("School3", "location3"));
		
	}
	public List<School> getAlldetails(){
		return list;
		
	}
	
	public School AddSchooldetails(School school){
		list.add(school);
		
		return school;
		
	}
	public School UpdateSchoolDetails(School school) {
		list.add(school);
		return school;
		
	}
}
