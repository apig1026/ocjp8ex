package com.ajoshow.ocjp8ex.topic6;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String... args) throws IOException {

		int[] nums = IntStream.rangeClosed(1, 3).toArray();
		
		IntStream is = Arrays.stream(nums);
		is.forEach(System.out::println);
		
		IntStream.rangeClosed(1, 3)
				.forEach(System.out::println);;
				
	}
}
