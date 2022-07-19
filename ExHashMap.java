package org.gemsco;

import java.util.HashMap;
import java.util.Map;



public class ExHashMap {
	
	//
	public int add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum "+ sum);
		return sum;
	}
	public static int square(int num) {
		System.out.println(num*num);
		return num;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm=new HashMap<>(2, 2.5f);
		hm.put("Vishal", null);
		hm.put("Sunny", 200);
		hm.put("Amit", 330);
		hm.put("Kashi", 202);
		
		HashMap<String, Integer> hm1=new HashMap<>(1,11.2f);
		hm1.put("Avishek", null);
		hm1.put("Sunny", 200);
		hm1.put("Ajit", 330);
		hm1.put("Nam", 201);
		
		HashMap<String, Integer> hm2=new HashMap<>(hm1);
		hm1.put("Neha", 333);
		hm1.remove("Ajit");
		hm1.put("Sunny", 444);
		System.out.println(hm+"\nOther map is\n"+hm1 );
		System.out.println("Map Size for hm "+hm.size() +" and hm1 "+hm1.size());
		
		System.out.println("Mapping of HashMap are: "+hm2 );
		System.out.println("===========================================");
		
		for(Map.Entry<String, Integer> e: hm1.entrySet()) {
			System.out.println("Map Entry "+ e.getKey()+" Map Value "+ e.getValue());
			
		}
		System.out.println("===========================================");
		int a= hm.get("Sunny");
		int sqr=11;
		square(sqr);
		System.out.println("Value for key "+a+"Contain key "+hm.containsKey("Kashi"));
		ExHashMap ea= new ExHashMap();
		int s= ea.add(88,99);
		
		

	}

	

}
