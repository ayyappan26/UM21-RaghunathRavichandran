package com.ultramain.um21.collectionAssignment;

import java.util.HashMap;
import java.util.Set;
class Animal{
	
}
public class StudentTest {
	public static void main(String args[]){
		HashMap<Integer,String> studentMap=new HashMap<>();
		studentMap.put(100,"Raja");
		studentMap.put(101,"King");
		studentMap.put(102,"Rani");
		studentMap.put(null,"Raghu");
		
		Set<Integer> keys= studentMap.keySet();
		for(Integer i :keys){
			System.out.println(studentMap.get(i));
		}
		
	}
}
