package com.ArrayList.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HaspmapUsingobject {

	public static void main(String[] args) {
		Map<Integer,Student> mapobject = new HashMap<>();
		mapobject.put(1,new Student("Lakshmi",208));
		mapobject.put(2, new Student("Sai",209));
		
		System.out.println(mapobject);
		System.out.println(mapobject.values());
		

	}

}
