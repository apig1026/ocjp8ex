package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class AverageEx2 extends BaseTest{

	@Override
	public Object withJava() {
		int sum = 0;
		int count = 0;
		for(Player p : players){
			if(p.getAge() == 30){
				sum += p.getAge();
				count++;
			}
		}
		return (double) sum / count; 
	}

	@Override
	public void withJava8(Object expectedResult) {
		Double average = players.stream()
				.filter(p -> p.getAge() == 30)
				.collect(Collectors.averagingDouble(p -> (double)p.getAge()));
				
		assertEquals(expectedResult, average);
	}
}
