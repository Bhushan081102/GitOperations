package com.example.PracticeSpring.Entity;

public class School {

	int id;
	String name;
	String location;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public School(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
