package com.ajoshow.ocjp8ex.topic6;

import java.util.HashMap;
import java.util.Map;

import com.ajoshow.ocjp8ex.test.BaseTest;

public class MapComputeIfEx extends BaseTest{
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
		String s = map.get(1);
		String s2 = map.get(4);
		String s3 = map.get(1);
		if(s == null){ s = "d"; }
		if(s2 == null){ s2 = "e"; }
		if(s3 != null){ s3 = "f"; }
		System.out.println(s + s2 + s3);
		return null;
	}

	@Override
	public void withJava8(Object expectedResult) {
		String s = map.computeIfAbsent(1, k -> "d");
		String s2 = map.computeIfAbsent(4, k -> "e");
		String s3 = map.computeIfPresent(1, (k, v) -> "f");
		System.out.println(s + s2 + s3);
	}
}
