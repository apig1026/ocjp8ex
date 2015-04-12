package com.ajoshow.ocjp8ex.topic6;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class ReplaceAllEx extends BaseTest{

	@Override
	public Object withJava() {
		List<Player> ps = getPlayers();
		for(int i=0; i<ps.size(); i++){
			ps.set(i, null);
		}
		return ps;
	}

	@Override
	public void withJava8(Object expectedResult) {
		List<Player> ps = getPlayers();
		ps.replaceAll(p -> null);
		assertEquals(expectedResult, ps);
	}
}
