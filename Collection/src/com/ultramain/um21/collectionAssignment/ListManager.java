package com.ultramain.um21.collectionAssignment;

import java.util.*;
public class ListManager {
	public static List<String>getArrayList(){
		String[] elements=new String[3];
		elements[0]="cat";
		elements[1]="dog";
		elements[2]="bird";
		List<String>list=new ArrayList();
		list=Arrays.asList(elements);
		return list;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(getArrayList());
		
	}
}