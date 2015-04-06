package com.ajoshow.ocjp8ex.topic7;

public class StaticDefaultEx {
	
	interface Parent{ 
		static void hi(){
			// must have body
		}
	}
	
	class Child implements Parent{
//		static void hi(){
//			// complier error
//		}
	}
	
	class Child2 implements Parent{
		void hi(){
			// ok, this is a class method
		}
	}
	
}
