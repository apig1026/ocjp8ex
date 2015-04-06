package com.ajoshow.ocjp8ex.topic7;

public class MutiInterfaceEx {
	
	interface Foo{ void noo(); }
	interface Boo{ void noo(); }
	interface Moo{ void noo(); }
	class Hoo implements Foo, Boo, Moo{
		@Override
		public void noo() {}
	}
	
	interface Foo2{ default void noo(){System.out.println("foo");} }
	interface Boo2{ void noo(); }
	class Hoo2 implements Foo2, Boo2{
		@Override
		public void noo() {System.out.println("hoo");}
	}
	
	abstract class Foo3{ abstract void noo(); }
	interface Boo3{ void noo(); }
	class Hoo3 extends Foo3 implements Boo3{
		@Override
		public void noo() {System.out.println("hoo");}
	}
	
	abstract class Foo4{ abstract void noo(); }
	interface Boo4{ default void noo(){System.out.println("boo");} }
	class Hoo4 extends Foo4 implements Boo4{
		@Override
		public void noo() {System.out.println("hoo");}
	}
	
	abstract class Foo5{ abstract void noo(); }
	interface Boo5{ default void noo(){System.out.println("boo");} }
	interface Moo5{ void noo(); }
	class Hoo5 extends Foo5 implements Boo5, Moo5{
		@Override
		public void noo() {System.out.println("hoo");}
	}
	
	abstract class Foo6{ abstract void noo(); }
	interface Boo6{ default void noo(){System.out.println("boo");} }
	interface Moo6{ default void noo(){System.out.println("moo");} }
	class Hoo6 extends Foo6 implements Boo6, Moo6{
		@Override
		public void noo() {System.out.println("hoo");}
	}
	
	interface Boo7{ default void noo(){System.out.println("boo");} }
	interface Moo7{ default void noo(){System.out.println("moo");} }
	class Hoo7 implements Boo7, Moo7{
		@Override
		public void noo() {System.out.println("hoo");}
	}
	
	public static void main(String[] args){
		MutiInterfaceEx obj = new MutiInterfaceEx();
		obj.new Hoo().noo();
		obj.new Hoo2().noo();
		obj.new Hoo3().noo();
		obj.new Hoo4().noo();
		obj.new Hoo5().noo();
		obj.new Hoo6().noo();
		obj.new Hoo7().noo();
	}
	
}
