package com.ajoshow.ocjp8ex.topic2;

public class UnaryOpEx{
	
	interface UnaryOp<T>{
		T perform(T t);
	}
	public void doStuff(UnaryOp<String> u){
		System.out.println(u.perform("something"));
	}
	
	public void withJava() {
		doStuff(new UnaryOp<String>(){
			@Override
			public String perform(String s) {
				return "baked " + s;
			}
		});
	}
	public void withJava8() {
		doStuff(s -> "baked " + s);
		doStuff(s -> "eat " + s);
	}
}
