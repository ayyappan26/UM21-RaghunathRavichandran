package com.ultramain.um21.collectionexercise;
import java.util.ArrayList;

class CollectionWork{
	public ArrayList<Integer> list=new ArrayList<Integer>();
	public  ArrayList<Integer> storeEvenNumbers(int n){
		list= new ArrayList<Integer>();
		int x=0;
		for(int i=2;i<=n;i++){
			 x=x+2;
			list.add(x);	
		}
		return list;
	}
	public void printEvenNumbers(ArrayList<Integer> list){
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int x: list){
			list2.add(x*2);	
		}
		//return list2;
		System.out.println(list2);
	}
	public int retriveEvenNumber(int s){
		boolean bl=list.contains(s);
		if(bl){
			return s;
		}else{
		return 0;
		}
	}
}

public class CollectionTest {
	public static void main(String arg[]){
		CollectionWork coll=new CollectionWork();
		ArrayList<Integer> result=new ArrayList<Integer>();
		result=coll.storeEvenNumbers(10);
		System.out.println(result);
		coll.printEvenNumbers(result);
		int r=coll.retriveEvenNumber(10);
		System.out.println(r);
		
		
	}
}