package com.ajoshow.ocjp8ex.topic1;


public class LambdaEx {
	@FunctionalInterface 
	interface NoArg{ void foo(); }

	@FunctionalInterface 
	interface OneArg{ void foo(String s); }
	
	@FunctionalInterface 
	interface TwoArg{ void foo(int x, int y); }
	
	public void perform(NoArg foo){}
	public void perform(TwoArg foo){}
	public void perform(OneArg foo){}

	public static void main(String[] args) {
		LambdaEx obj = new LambdaEx();
		obj.perform(()->System.out.println(""));
		obj.perform(s->System.out.println(s));
		obj.perform((x,y)->System.out.println(x+y));
		obj.perform((int x,int y)->System.out.println(x+y));
	}

}
