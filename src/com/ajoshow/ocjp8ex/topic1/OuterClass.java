package com.ajoshow.ocjp8ex.topic1;

// filename: OuterClass.java
public class OuterClass {
	
	static class InnerClass{}
	
	class InnerClass2{}
	
	public void doStuff(Object obj){
		class InnerClass3{}
	}
	
	public static void main(String[] args){
		new OuterClass().doStuff(new InnerClass4(){});
		new InnerClass();
		new OuterClass().new InnerClass2();
		new InnerClass4();
	}
}

class InnerClass4{}

//static class InnerClass5{}

//private class InnerClass6{}
