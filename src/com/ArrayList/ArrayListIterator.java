package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("strawberry");
		fruits.add("blackberry");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		System.out.println("...............using normlfor loop........ ");
		
		for(int i =0;i <fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		
		System.out.println("...........using for each loop...");
		for(String str : fruits) 
		{
			System.out.println(str);
		}
		
		System.out.println(".......Using Iterator .....");
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
		 System.out.println(itr.next());	
		}
		
		System.out.println("......for each loop.......");
		
		fruits.forEach(fruitsfare-> System.out.println(fruitsfare));
		
		System.out.println(".........listiterator........");
		
		ListIterator<String> listiter = fruits.listIterator();
		while(listiter.hasNext())
		{
			System.out.println(listiter.next());
		}
		
		System.out.println("...........reverse.........");
		while(listiter.hasPrevious())
		{
			System.out.println(listiter.previous());
		}
		
		
		
		}

}
