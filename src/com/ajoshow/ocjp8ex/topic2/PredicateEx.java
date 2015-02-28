package com.ajoshow.ocjp8ex.topic2;

public class PredicateEx{
	
	interface Predicate<T>{
		boolean perform(T t);
	}
	public void doStuff(Predicate<String> p){
		String s = "something";
		if(p.perform(s)){System.out.println("do" + s);}
	}
	
	public void withJava() {
		doStuff(new Predicate<String>(){
			@Override
			public boolean perform(String s) {
				return s != null;
			}
		});
	}
	public void withJava8() {
		doStuff(s -> s != null);
	}
}
