package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;

public class Pipeline3{
	List<Apple> apples = new ArrayList<Apple>();
	
	public Pipeline3(){
		apples.add(new Apple("green", 200));
		apples.add(new Apple("red", 300));
		apples.add(new Apple("red",50));
	}
	
	public Pipeline3 findRedApples() {
		List<Apple> redApples = new ArrayList<Apple>();
		for(Apple apple : apples){
			if("red".equals(apple)){
				redApples.add(apple);
			}
		}
		apples = redApples;
		return this;
	}
	
	public Pipeline3 findLowFatApples() {
		List<Apple> lowFatRedApples = new ArrayList<Apple>();
		for(Apple apple : apples){
			if(apple.getCalory() < 100){
				lowFatRedApples.add(apple);
			}
		}
		apples = lowFatRedApples;
		return this;
	}
	
	public List<Apple> getApples(){return apples;}
	
	public static void main(String[] args) {
		new Pipeline3()
				.findLowFatApples()
				.findRedApples()
				.getApples();
	}
}
