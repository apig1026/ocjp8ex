package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class FindAnyEx extends BaseTest{

	@Override
	public Object withJava() {
		List<Integer> ages = new ArrayList<Integer>();
		for(Player p : players){
			if(p.getAge() == 30)
				ages.add(p.getAge());
		}
		Collections.shuffle(ages);
		return ages.get(0);
	}

	@Override
	public void withJava8(Object expectedResult) {
		Optional<Player> player = players.stream()
				.filter(p -> p.getAge() == 30)
				.findAny();
		assertEquals(expectedResult, player.get().getAge());
	}
}
