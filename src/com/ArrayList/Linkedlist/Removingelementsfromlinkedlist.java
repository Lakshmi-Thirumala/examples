package com.ArrayList.Linkedlist;

import java.util.LinkedList;

public class Removingelementsfromlinkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Virat");
		list.add("Dhoni");
		list.add("Gurbaz");
		list.add("Markram");
		list.add("Sikender raja");
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		
		System.out.println(list.removeLast());
		System.out.println(list);

		System.out.println(list.remove("Markram"));
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
	}

}
