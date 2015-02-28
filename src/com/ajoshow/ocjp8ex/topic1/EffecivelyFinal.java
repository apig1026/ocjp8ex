package com.ajoshow.ocjp8ex.topic1;

// filename: OuterClass.java
public class EffecivelyFinal {
	
	interface InnerClass{void print();}
	public void doStuff(InnerClass o){}
	
	public static void main(String[] args){
		final int x = 5;
		int y = 10;
		new EffecivelyFinal().doStuff(new InnerClass() {
			@Override
			public void print() {
				System.out.println(x);
				System.out.println(y);
			}
		});
//		y = 15;
		new EffecivelyFinal().doStuff(new InnerClass() {
			@Override
			public void print() {
				System.out.println(y);
			}
		});
	}
}
