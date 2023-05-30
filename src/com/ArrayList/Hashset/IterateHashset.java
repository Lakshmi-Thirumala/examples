package com.ArrayList.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashset {

	public static void main(String[] args) {
		Set<String> friends = new HashSet<>();
		 friends.add("Adi");
		 friends.add("Jyothi");
		 friends.add("Swathi");
		 friends.add("Niharika");
		 friends.add("Mounika");
		 friends.add("Niharika");
		 
		 System.out.println(friends);
		 
		 
		 System.out.println("........................");
		for(String friend: friends)
		{
			System.out.println(friend);
		}
		
		System.out.println("........................");
		
		friends.forEach(ele->System.out.println(ele));
		
		System.out.println("........................");
		
		Iterator<String> itr= friends.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}

}
