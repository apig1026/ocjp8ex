package com.ajoshow.ocjp8ex.topic6;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import com.ajoshow.ocjp8ex.test.BaseTest;

public class MergeEx extends BaseTest{
	Map<Integer, String> map;
	
	@Override
	public void init(){
		map = new HashMap<Integer, String>();
		map.put(1,"a");
		map.put(2,"a");
	}
	
	@Override
	public Object withJava() {
		String s = map.get(1);
		map.put(1, "hello " + s);
		return map.get(1);
	}

	@Override
	public void withJava8(Object expectedResult) {
		String newValue = map.merge(2, "hello", (s1, s2) -> s2 + " " + s1);
		assertEquals(expectedResult, newValue);
	}
}
