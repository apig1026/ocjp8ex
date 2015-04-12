package com.ajoshow.ocjp8ex.topic6;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.ajoshow.ocjp8ex.test.BaseTest;

public class MapForEachEx extends BaseTest{
	Map<Integer, String> map;
	
	@Override
	public void init(){
		map = new HashMap<Integer, String>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
	}
	
	@Override
	public Object withJava() {
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<Integer, String> entry = iterator.next();
			System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
		}
		return map;
	}

	@Override
	public void withJava8(Object expectedResult) {
		map.forEach((k,v) -> System.out.println("Key:" + k + " Value: " + v));
		assertEquals(expectedResult, map);
	}
}
