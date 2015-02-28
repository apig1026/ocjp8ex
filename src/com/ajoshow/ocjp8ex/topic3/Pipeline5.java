package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pipeline5{
	List<Apple> apples = new ArrayList<Apple>();
	
	public Pipeline5(){
		apples.add(new Apple("green", 200));
		apples.add(new Apple("red", 300));
		apples.add(new Apple("red",50));
	}
	
	public List<Apple> findLowFatAndRedApples(){
		return apples.stream()
				.filter(apple -> "red".equals(apple))
				.filter(apple -> apple.getCalory() < 100)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		new Pipeline5().findLowFatAndRedApples();
	}
}
