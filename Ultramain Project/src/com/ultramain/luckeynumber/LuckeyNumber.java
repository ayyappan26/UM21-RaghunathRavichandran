package com.ultramain.luckyNumber;

import java.util.ArrayList;

class FavNumber{
	 public void getLuckyNumber(int num){
		 
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 int sum=0;
		 int rem=0;
		 for(int i=1;i<=100;i++){
			 if((i<10) && (i==num)){
				 arr.add(i);
			 }else if(i>=10){
				 rem=i;
				 while(rem>0){
					 sum=sum+rem%10;
					 rem=rem/10;
				 }
			 }
			 if(sum==num){
				 arr.add(i);
			 }
			 sum=0;
		 }
		 for(int x:arr){
			 if(x>0){
				 System.out.println(x);
			 }
		 }
		 
	 }
 }
 public class Numbers{
	 public static void main(String arg[]){
		 FavNumber mynum=new FavNumber();
		 mynum.getLuckyNumber(8);
	 }
 }