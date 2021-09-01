package com.ultramain.collectionlist;

import java.util.ArrayList;
import java.util.Random;

class ListExample{
	public void listTest(){
		int myarr[]=new int[10];
		for(int i=0;i<10;i++){
			myarr[i]=new Random().nextInt(50);
		}
		for(int res : myarr){
			System.out.println(res);
		}
		
	}
}
public class CollectionTest{
	public static void main(String arg[]){
		ListExample mylist=new ListExample();
		mylist.listTest();
	}
}