package com.ArrayList.Hashset;

import java.util.HashSet;
import java.util.Set;

public class CreatingHashSet {

	public static void main(String[] args) {
		Set<Integer> fivenumbers = new HashSet<>();
		fivenumbers.add(1);
		fivenumbers.add(2);
		fivenumbers.add(3);
		fivenumbers.add(4);
		fivenumbers.add(5);
		System.out.println(fivenumbers);
		
		
	//	Set<Integer> tennumbers = new HashSet<>(fivenumbers);
		Set<Integer> tennumbers = new HashSet<>();
		tennumbers.add(6);
		tennumbers.add(7);
		tennumbers.add(8);
		tennumbers.add(9);
		tennumbers.add(10);
		tennumbers.add(null);
		tennumbers.add(10);
		
		//System.out.println(tennumbers);
		tennumbers.addAll(fivenumbers);
		System.out.println(tennumbers);
		//System.out.println(tennumbers.toString());
		
		fivenumbers.remove(2);
		System.out.println(fivenumbers);
		
		fivenumbers.removeAll(fivenumbers);
		System.out.println(fivenumbers);
		
		tennumbers.clear();
		System.out.println(tennumbers);
		
		
		
		
	}

}
