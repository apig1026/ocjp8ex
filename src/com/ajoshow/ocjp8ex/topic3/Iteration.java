package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;

public class Iteration{
	List<Apple> apples = new ArrayList<Apple>();
	
	public Iteration(){
		apples.add(new Apple("green"));
		apples.add(new Apple("red"));
		apples.add(new Apple("red"));
	}
	
	public void withJava8() {
		apples.forEach(apple -> {
			if("green".equals(apple)){
				System.out.println("I found green apple.");
			}
		});
	}
}
