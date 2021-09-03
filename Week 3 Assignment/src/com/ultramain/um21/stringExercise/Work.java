package com.ultramain.um21.stringExercise;

public class Work {
	public static void main(String args[]){
		String str="Welcome to Java World";
		char ch=str.charAt(5);
		System.out.println(ch);
		boolean eq=str.equalsIgnoreCase("Welcome");
		System.out.println(eq);
		String con=" Let us learn";
		String res=str+con;
		System.out.println(res);
		System.out.println(str.indexOf("a"));
		String rep=str.replaceAll("a", "e");
		System.out.println(rep);
		System.out.println(str.substring(4,10));
		System.out.println(str.toLowerCase());
		
	}
}
