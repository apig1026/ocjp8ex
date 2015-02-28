package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class PartitioningByEx extends BaseTest{

	@Override
	public Object withJava() {
		Map<Boolean, List<Player>> ps = new HashMap<Boolean, List<Player>>();
		ps.put(true, new ArrayList<Player>());
		ps.put(false, new ArrayList<Player>());
		for(Player p : players){
			if(p.getAge() > 28){
				ps.get(true).add(p);
			}else{
				ps.get(false).add(p);
			}
		}
		return ps; 
	}

	@Override
	public void withJava8(Object expectedResult) {
		Map<Boolean, List<Player>> ps = players.stream()
				.collect(Collectors.partitioningBy(p -> p.getAge() > 28));
				
		assertEquals(expectedResult, ps);
	}
}
