package com.ArrayList.Linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> iplteam = new LinkedList<>();
		iplteam.add("RCB");
		iplteam.add("Csk");
		iplteam.add("RCB");
		iplteam.addFirst("Gujarat titans");
		iplteam.addLast("DC");
		
		System.out.println(iplteam);
		
		iplteam.add(3,"KKR");
		
		System.out.println(iplteam);
		
		System.out.println(iplteam.contains("RCB"));
		System.out.println(iplteam.indexOf("KKR"));
		System.out.println(iplteam.lastIndexOf("RCB"));

	}

}
