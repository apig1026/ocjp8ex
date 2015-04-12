package com.ajoshow.ocjp8ex.topic6;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class RemoveIfEx extends BaseTest{

	@Override
	public Object withJava() {
		List<Player> ps = getPlayers();
		Iterator<Player> iterator = ps.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getAge() > 30){
				iterator.remove();
			}
		}
		return ps;
	}

	@Override
	public void withJava8(Object expectedResult) {
		List<Player> ps = getPlayers();
		ps.removeIf(p -> p.getAge() > 30);
		assertEquals(expectedResult, ps);
	}
}
