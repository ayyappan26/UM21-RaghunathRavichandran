package com.ultramain.objectCasting;

public class ObjectTesting{
	public static void main(String arg[]){
		Son myson=new Son();
		Daughter mydau=new Daughter();
		Display dis=new Display();
		dis.displayKidDetail(myson);
		dis.displayKidDetail(mydau);
	}
	
}
class GrandFather{
	public void sleep(){
		System.out.println("Grandpa Sleep for 4 hrs");
	}
}
class Dad extends GrandFather{
	public void eat(){
		System.out.println("Dad likes non veg");
	}
	public void income()
	{
		System.out.println("Dad running a business");
	}
}
class Son extends Dad{
	public void eat(){
		System.out.println("Son likes Biriyani");
	}
	public void boxing(){
		System.out.println("Son know Boxing");
	}
	public void income()
	{
		
	System.out.println("Son is doing part-time job");
	}
}
class Daughter extends Dad{
	public void eat(){
		System.out.println("Daughter likes Panipuri");
	}
	public void dance(){
		System.out.println("Daughter knows dancing");
	}
}
class Display{
	public void displayKidDetail(Dad mydad){
		if(mydad instanceof Son)
		{
			Son myson=(Son)mydad;
			myson.eat();
			myson.income();
			myson.boxing();
			System.out.println("--------------------");
			
		}
		if(mydad instanceof Daughter){
			Daughter mydau=(Daughter)mydad;
			mydau.eat();
			mydau.income();
			mydau.dance();
		}
	}
}