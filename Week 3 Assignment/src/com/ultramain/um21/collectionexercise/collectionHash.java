package com.ultramain.um21.collectionexercise;

import java.util.HashSet;
class CollectionHashWork{
	
	HashSet<String> hash1=new HashSet<>();
	public HashSet<String> storeCountryName(String country){
		hash1=new HashSet<String>();
		hash1.add(country);
		return hash1;
	}
	public String retriveCountry(String country){
		boolean b=hash1.contains(country);
		if(b){
			return country;
		}else{
			return null;
		}
	}
}
public class collectionHash {
	public static void main(String arg[]){
		String country="India";
		CollectionHashWork collhash=new CollectionHashWork();
		HashSet<String> result=new HashSet<String>();
		result=collhash.storeCountryName(country);
		System.out.println(result);
		String str;
		str=collhash.retriveCountry(country);
		System.out.println(str);	
	}

}
