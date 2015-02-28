package com.ajoshow.ocjp8ex.topic2;

public class BinaryOpEx{
	
	interface BinaryOp<T>{
		T perform(T t, T t2);
	}
	public void doStuff(BinaryOp<Integer> b){
		System.out.println(b.perform(2, 1));
	}
	
	public void withJava() {
		doStuff(new BinaryOp<Integer>(){
			@Override
			public Integer perform(Integer a, Integer b) {
				return a + b;
			}
		});
	}
	public void withJava8() {
		doStuff((a, b) -> a * b);
		doStuff((a, b) -> a - b);
	}
}
