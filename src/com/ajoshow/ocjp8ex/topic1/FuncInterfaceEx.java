package com.ajoshow.ocjp8ex.topic1;


public class FuncInterfaceEx {
	
	interface Foo{ void foo(); }
	
	@FunctionalInterface
	interface Foo2{ void foo(); }
	
//	@FunctionalInterface
//	interface Foo3{ static void foo();}
	
//	@FunctionalInterface
//	interface Foo4 extends Foo3{ void foo();}
	
//	@FunctionalInterface
//	interface Foo5 { default void foo(){};}
	
//	@FunctionalInterface
//	interface Foo6 extends Foo5 { void foo();}
	
//	interface Foo7 { default void foo();}
	
//	@FunctionalInterface
//	interface Foo8 extends Foo6 { void foo();}
	
}
