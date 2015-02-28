package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.OptionalDouble;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class AverageEx extends BaseTest{

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
		return (double) sum / count; // return sum
	}

	@Override
	public void withJava8(Object expectedResult) {
		OptionalDouble average = players.stream()
				.filter(p -> p.getAge() == 30)
				.mapToInt(p -> p.getAge())
				.average(); // sum()
				
		assertEquals(expectedResult, average.getAsDouble());
	}
}
