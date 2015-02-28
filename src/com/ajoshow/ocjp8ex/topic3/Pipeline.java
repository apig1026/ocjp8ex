package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;

public class Pipeline{
	List<Apple> apples = new ArrayList<Apple>();
	
	public Pipeline(){
		apples.add(new Apple("green", 200));
		apples.add(new Apple("red", 300));
		apples.add(new Apple("red",50));
	}
	
	public void withJava() {
		List<Apple> redApples = new ArrayList<Apple>();
		for(Apple apple : apples){
			if("red".equals(apple)){
				redApples.add(apple);
			}
		}

		List<Apple> lowFatRedApples = new ArrayList<Apple>();
		for(Apple apple : redApples){
			if(apple.getCalory() < 100){
				lowFatRedApples.add(apple);
			}
		}
	}
}
