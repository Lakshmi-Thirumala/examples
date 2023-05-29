package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Removingelements {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("guava");
		fruits.add("Mango");
		fruits.add("sapota");
		fruits.add("Fig");
		
		System.out.println(fruits);
		
		fruits.remove(3);
		
	
		System.out.println(fruits);
		
		fruits.remove("Mango");
		
		System.out.println(fruits);
		
		List<String> subfruits = new ArrayList<>();
		subfruits.add("watermelon");
		subfruits.add("grapes");
		
		fruits.addAll(subfruits);
		
		System.out.println(fruits);
		
		fruits.removeAll(subfruits);
		
		System.out.println(fruits);
		
		fruits.clear();
		
		System.out.println(fruits);
		
	}

}
