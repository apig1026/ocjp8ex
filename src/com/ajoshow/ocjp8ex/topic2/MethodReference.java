package com.ajoshow.ocjp8ex.topic2;

import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference{
	public static void main(String[] args){
		// ClassName::staticMethodName
		IntFunction<String> f = n -> String.valueOf(n);
		IntFunction<String> f1 = String::valueOf;
		
		// ClassName::new
		Supplier<String> f2 = () -> new String();
		Supplier<String> f3 = String::new;
		
		// ClassName::instanceMethodName
		UnaryOperator<String> f4 = s -> s.trim();
		UnaryOperator<String> f5 = String::trim;

		// object::instanceMethodName
		Integer i = new Integer(1);
		Supplier<String> f6 = () -> i.toString();
		Supplier<String> f7 = i::toString;
	}
	
}
