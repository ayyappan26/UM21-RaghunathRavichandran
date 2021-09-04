package com.ultramain.um21.stringexercise;

public class Buffer {
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("This is StrinBuffer");
		sb.append(" This is a Sample Program");
		System.out.println(sb);
		StringBuffer l=sb.insert(21,"Object");
		System.out.println(l);
		sb.reverse();
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("This is StrinBuffer");
		sb1.replace(14,21,"Builder");
		System.out.println(sb1);
	}
}
