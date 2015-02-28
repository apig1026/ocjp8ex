package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class AnyMatchEx extends BaseTest{

	@Override
	public Object withJava() {
		for(Player p : players){
			if(p.getAge() == 30)
				return true;
		}
		return false;
	}

	@Override
	public void withJava8(Object expectedResult) {
		Boolean b = players.stream()
				.anyMatch(p -> p.getAge() == 30);
		assertEquals(expectedResult, b);
	}
}
