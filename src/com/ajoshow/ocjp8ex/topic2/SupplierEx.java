package com.ajoshow.ocjp8ex.topic2;

public class SupplierEx{
	
	interface Supplier<T>{
		T perform();
	}
	public void doStuff(Supplier<String> s){
		System.out.println(s.perform());
	}
	
	public void withJava() {
		doStuff(new Supplier<String>(){
			@Override
			public String perform() {
				return "Hello World";
			}
		});
	}
	public void withJava8() {
		doStuff(() -> "Hello World".toLowerCase());
		doStuff(() -> {return "Hello World".toUpperCase();});
	}
}
