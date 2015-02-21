package com.ajoshow.ocjp8ex.index;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

/**
 * Exercise Objective 
 * 2.2. Develop code that uses Function interface
 * 2.6. Develop code that uses Predicate interface
 * 
 * @author Andy
 */
public class Exercise1 extends BaseTest{

	@Override
	public Object withJava() {
		List<String> names = new ArrayList<String>();
		
		for(Player p : players){
			if(p.getAge() > 35){
				names.add(p.getName());
			}
		}
		return names;
	}

	@Override
	public void withJava8(Object expectedResult) {
		List<String> names = players.stream()
				.filter(p -> p.getAge() > 35)
				.map(Player::getName)
				.collect(Collectors.toList());
		
		assertEquals(expectedResult, names);
	}

}
