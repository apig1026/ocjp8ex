package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Pipeline4{
	List<Apple> apples = new ArrayList<Apple>();
	
	public Pipeline4(){
		apples.add(new Apple("green", 200));
		apples.add(new Apple("red", 300));
		apples.add(new Apple("red",50));
	}
	
	public Pipeline4 filter(Predicate<Apple> p) {
		List<Apple> redApples = new ArrayList<Apple>();
		for(Apple apple : apples){
			if(p.test(apple)){
				redApples.add(apple);
			}
		}
		apples = redApples;
		return this;
	}
	
	public List<Apple> getApples(){return apples;}
	
	public static void main(String[] args) {
		new Pipeline4()
				.filter(apple -> "red".equals(apple) 
						&& apple.getCalory() < 100)
				.getApples();
	}
}
