package com.ArrayList.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreatingHashMap {

	public static void main(String[] args) {
		Map<String,Integer> mapob = new HashMap<>();
		mapob.put("one", 1);
		mapob.put("Two", 2);
		mapob.put("Three", 3);
		mapob.put("Four", 4);
		
		mapob.put(null, 5);
		
		System.out.println(mapob);
		
		System.out.println(mapob.isEmpty());
		
		System.out.println(mapob.size());
		
		
		if(mapob.containsKey("Four"))
		{
			System.out.println("exist");
		}
		else
		{
			System.out.println("not exists");
		}

		if(mapob.containsValue(6))
		{
			System.out.println("exist");
		}
		else
		{
			System.out.println("not exist");
		}
		
		System.out.println(mapob.get("Two"));
		
		mapob.remove("Three");
		System.out.println(mapob);
		
		
		System.out.println(mapob.keySet());
		System.out.println(mapob.entrySet());
		
		System.out.println(mapob.values());
		
		
		
		for(Map.Entry<String,Integer> entry : mapob.entrySet() )
		{
			System.out.println("key"+"  "+ entry.getKey()+"  "+ "value"+"  "+ entry. getValue());
		}
		
		
		System.out.println("...............");
		
		Set<Map.Entry<String,Integer>> entries= mapob.entrySet();
		Iterator<Map.Entry<String,Integer>> itr = entries.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("key ->" + entry.getKey() + " value-> " + entry.getValue());
		}
		
		System.out.println("...............");
		
		mapob.forEach((K,V)-> {
			System.out.println(" K "+ K);
			System.out.println(" V "+ V);
		});
		
		}
	
	

}
