package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InternalIteration{
	List<Apple> apples = new ArrayList<Apple>();
	
	public InternalIteration(){
		apples.add(new Apple("green"));
		apples.add(new Apple("red"));
		apples.add(new Apple("red"));
	}
	
	public void withJava8(Consumer<Apple> c) {
		for(Apple apple : apples){
			c.accept(apple);
		}
	}
	
	public void doStuff(){
		withJava8(apple -> {
			if("green".equals(apple)){
				System.out.println("I found green apple.");
			}
		});
	}
}
