package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Accessingelements {

	public static void main(String[] args)
	{
		
		List<String> iplteam = new ArrayList<>();
		
		System.out.println("list is empty or not :  "+ iplteam.isEmpty());
		
		iplteam.add("Rcb");
		iplteam.add("KKR");
		iplteam.add("KXIPS");
		iplteam.add("CSK");
		iplteam.add("SRH");
		
		System.out.println("number of elements:"+iplteam.size() );
		
		iplteam.forEach(iplteams->System.out.println(iplteams)); 
		
		System.out.println(iplteam);
		
		
		System.out.println(iplteam.get(3));
		
		System.out.println(iplteam.get(4));
		
		iplteam.set(3, "Gujarat titans");
		
		System.out.println(iplteam);
		
		
	}

}
