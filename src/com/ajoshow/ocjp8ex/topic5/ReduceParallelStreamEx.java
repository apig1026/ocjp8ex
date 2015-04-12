package com.ajoshow.ocjp8ex.topic5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceParallelStreamEx {
	public static void main(String... args) {

		List<Person> persons = Stream.generate(()->new Person((int)(Math.random()*99)+1))
								.limit(10)
								.collect(Collectors.toList());
								
		int x = persons.parallelStream()
						.mapToInt(p -> p.getAge())
						.reduce(0, (a,b) -> b > a ? b : a);
		System.out.println("Max: " + x);
	}
	
	static class Person{
		private int age;
		Person(int age){
			this.age = age;
		}
		public int getAge(){
			return age;
		}
	}
}
