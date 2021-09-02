package com.ultramain.um21.collectionAssignment;

import java.util.ArrayList;
public class ListManager1 {
	
	public List<String> removeElements(){
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("Hello");
			list1.add("welcome");
			list1.add("Hi");
			list1.add("Java");
			ArrayList<String> list2=new ArrayList<String>();
			list2.add("Hello");
			list2.add("Java");
			list2.add("Raj");
			list1.retainAll(list2);
			System.out.println(" "+list1);
			
			return list1 ;
			
		}
}
