package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class MapEx extends BaseTest{

	@Override
	public Object withJava() {
		List<String> names = new ArrayList<String>();
		for(Player p : players){
			names.add(p.getName());
		}
		return names;
	}

	@Override
	public void withJava8(Object expectedResult) {
		List<String> names = players.stream()
				.map(Player::getName)
				.collect(Collectors.toList());
		assertEquals(expectedResult, names);
	}

}
