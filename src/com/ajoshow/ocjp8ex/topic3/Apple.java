package com.ajoshow.ocjp8ex.topic3;

public class Apple {
	private String color;
	private int calory;
	
	public Apple(){
		this.color = "red";
		this.calory = 300;
	}
	
	public Apple(String color) {
		this.color = color;
		this.calory = 300;
	}
	
	public Apple(String color, int calory) {
		this.color = color;
		this.calory = calory;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getCalory(){
		return calory;
	}
}
