package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class GroupingByEx extends BaseTest{

	@Override
	public Object withJava() {
		Map<String, List<Player>> ps = new HashMap<String, List<Player>>();
		for(Player p : players){
			String key = p.getNationality();
			if(ps.containsKey(key)){
				ps.get(key).add(p);
			}else{
				List<Player> value = new ArrayList<Player>();
				value.add(p);
				ps.put(key, value);
			}
		}
		return ps; 
	}

	@Override
	public void withJava8(Object expectedResult) {
		Map<String, List<Player>> ps = players.stream()
				.collect(Collectors.groupingBy(p -> p.getNationality()));
				
		assertEquals(expectedResult, ps);
	}
}
