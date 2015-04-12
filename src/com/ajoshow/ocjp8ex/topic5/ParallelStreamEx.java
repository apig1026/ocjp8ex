package com.ajoshow.ocjp8ex.topic5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamEx {
	public static void main(String... args) {

		long sum = IntStream.range(1, 100_000).parallel().sum();
		System.out.println("Sum: " + sum);
		
		int x = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
			.parallelStream()
			.collect(Collectors.summingInt(i -> i));
		System.out.println(x);
	}
}
