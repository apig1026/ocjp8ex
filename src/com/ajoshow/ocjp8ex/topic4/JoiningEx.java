package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class JoiningEx extends BaseTest{

	@Override
	public Object withJava() {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(Player p : players){
			if(count == 0){
				sb.append(p.getName());
				count++;
			}else{
				sb.append(", ").append(p.getName());
			}
		}
		return sb.toString(); 
	}

	@Override
	public void withJava8(Object expectedResult) {
		String name = players.stream()
		 		.map(p -> p.getName())
				.collect(Collectors.joining(", "));
				
		assertEquals(expectedResult, name);
	}
}
