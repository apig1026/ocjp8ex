package com.ajoshow.ocjp8ex.topic7;

public class DefaultInheritEx {
	
	interface Parent{ 
		default void hi(){System.out.println("parent hi");} 
	}
	interface Child{ 
		default void hi(){System.out.println("child hi");}; 
	}
	interface Child2 extends Parent{ 
		default void hi(){System.out.println("child2 hi");}; 
	}
	
	class ParentImpl implements Parent{
		@Override public void hi(){}; 
	}
	class ChildImpl extends ParentImpl implements Child{
		@Override public void hi(){System.out.println("child impl hi");}
	}
	class ChildImpl2 extends ParentImpl implements Child2{
		@Override public void hi(){System.out.println("child impl2 hi");} 
	}
	class ChildImpl3 implements Child{
	}
//	class ChildImpl4 implements Child, Child2{
//	}
	class ChildImpl5 extends ParentImpl implements Child, Child2{
	}
	
	public static void main(String[] args){
		DefaultInheritEx obj = new DefaultInheritEx();
		obj.new ChildImpl().hi();
		obj.new ChildImpl2().hi();
		obj.new ChildImpl3().hi();
//		obj.new ChildImpl4().hi();
		obj.new ChildImpl5().hi();
	}
	
}
