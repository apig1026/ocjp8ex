package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;

public class Pipeline2{
	List<Apple> apples = new ArrayList<Apple>();
	
	public Pipeline2(){
		apples.add(new Apple("green", 200));
		apples.add(new Apple("red", 300));
		apples.add(new Apple("red",50));
	}
	
	public List<Apple> findRedApples(List<Apple> apples) {
		List<Apple> redApples = new ArrayList<Apple>();
		for(Apple apple : apples){
			if("red".equals(apple)){
				redApples.add(apple);
			}
		}
		return redApples;
	}
	
	public List<Apple> findLowFatApples(List<Apple> apples) {
		List<Apple> lowFatRedApples = new ArrayList<Apple>();
		for(Apple apple : apples){
			if(apple.getCalory() < 100){
				lowFatRedApples.add(apple);
			}
		}
		return lowFatRedApples;
	}
	
	public List<Apple> findLowFatAndRedApples(List<Apple> apples) {
		return findLowFatAndRedApples(findRedApples(apples));
	}
}
