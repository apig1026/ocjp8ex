package com.ajoshow.ocjp8ex.topic2;

public class ConsumerEx{
	
	interface Consumer<T>{
		void perform(T t);
	}
	public void doStuff(Consumer<String> c){}
	
	public void withJava() {
		doStuff(new Consumer<String>(){
			@Override
			public void perform(String t) {
				System.out.println(t);
			}
		});
	}
	public void withJava8() {
		doStuff(s -> System.out.println(s.toLowerCase()));
		doStuff(s -> System.out.println(s.toUpperCase()));
	}
}
