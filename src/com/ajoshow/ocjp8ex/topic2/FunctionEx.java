package com.ajoshow.ocjp8ex.topic2;

public class FunctionEx{
	
	interface Function<T, R>{
		R perform(T t);
	}
	public void doStuff(Function<Integer, String> f){
		System.out.println(f.perform((int)Math.random() * 100));
	}
	
	public void withJava() {
		doStuff(new Function<Integer, String>(){
			@Override
			public String perform(Integer s) {
				if(s >= 60) return "pass";
				else return "fail";
			}
		});
	}
	public void withJava8() {
		doStuff(score -> {
			if(score >= 80) return "pass";
			else return "fail";
		});
	}
}
