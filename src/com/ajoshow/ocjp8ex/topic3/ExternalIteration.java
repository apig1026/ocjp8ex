package com.ajoshow.ocjp8ex.topic3;

import java.util.ArrayList;
import java.util.List;

public class ExternalIteration{
	List<Apple> apples = new ArrayList<Apple>();
	
	public ExternalIteration(){
		apples.add(new Apple("green"));
		apples.add(new Apple("red"));
		apples.add(new Apple("red"));
	}
	
	public void withJava() {
		for(Apple apple : apples){
			if("green".equals(apple)){
				System.out.println("I found green apple.");
			}
		}
	}
}
