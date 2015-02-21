package com.ajoshow.ocjp8ex.model;

public class Person {
	private String name;
	private String nationality;
	private int age;
	
	public Person(String name, int age, String nationality){
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
