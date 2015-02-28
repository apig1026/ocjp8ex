package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class SortEx extends BaseTest{

	@Override
	public Object withJava() {
		List<Player> ps = players;
		Collections.sort(players, new Comparator<Player>() {

			@Override
			public int compare(Player p1, Player p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		return ps;
	}

	@Override
	public void withJava8(Object expectedResult) {
		List<Player> ps = players;
		ps.sort((p1, p2) ->  p1.getName().compareTo(p2.getName()));
				
		assertEquals(expectedResult, ps);
	}
}
