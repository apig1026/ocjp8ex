package com.ajoshow.ocjp8ex.topic2;

import com.ajoshow.ocjp8ex.topic2.PredicateEx.Predicate;

public class IntPredicateEx{
	
	interface IntPredicate extends Predicate<Integer>{
		boolean perform(int t);
	}
	public void doStuff(IntPredicate p){
		if(p.perform((int) Math.random() * 10)){
			System.out.println("Hello World");
		}
	}
	public void withJava() {
//		doStuff(new IntPredicate(){
//			@Override
//			public boolean perform(int t) {
//				return false;
//			}
//		});
	}
	public void withJava8() {
//		doStuff(n -> true);
	}
}
