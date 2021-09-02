package com.ultramain.um21.collectionAssignment;

import java.text.SimpleDateFormat;	
import java.util.Date;
public class DateTest {
	public static void main(String args[]){
		Date myDate=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy");
		String str=sf.format(myDate);
		System.out.println("Date...."+str);
	}
}
