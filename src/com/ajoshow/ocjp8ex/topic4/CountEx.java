package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class CountEx extends BaseTest{

	@Override
	public Object withJava() {
		List<Player> ps = new ArrayList<Player>();
		for(Player p : players){
			if(p.getAge() == 30)
				ps.add(p);
		}
		return ps.size();
	}

	@Override
	public void withJava8(Object expectedResult) {
		long c = players.stream()
				.filter(p -> p.getAge() == 30)
				.count();
		assertEquals(expectedResult, (int)c);
	}
}
