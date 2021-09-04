package com.ultramain.um21.interfaceassignment;

public class LibraryInterfaceDemo {
	public static void main(String arg[]){
		KidUser kid=new KidUser();
		kid.registerAccount(10);
		kid.requestBook("Kids");
		KidUser mykid=new KidUser();
		mykid.registerAccount(18);
		mykid.requestBook("Fiction");
		AdultUser adult=new AdultUser();
		adult.registerAccount(5);
		adult.requestBook("Kids");
		AdultUser myadult=new AdultUser();
		myadult.registerAccount(23);
		myadult.requestBook("Fiction");
		
	
	}

}
interface LibraryUser{
	public abstract void registerAccount(int age);
	public abstract void requestBook(String bookType);
}
class KidUser implements LibraryUser{
	public int age;
	public String bookType;

	public void registerAccount(int age){
		this.age=age;

		
		if(age<12){
			System.out.println("You have successfully registered under a Kids Account");
		}
		else{
			System.out.println("");
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String bookTypes){
		this.bookType=bookTypes;
		if(bookType.equals("Kids")){
			System.out.println("");
			System.out.println("Book Issued successfully, please return the book within 10 days");
			
		}
		else  {
			System.out.println("");
			System.out.println("Oops, you are allowed to take only kids books");
		}
	
	}
	
}
class AdultUser implements LibraryUser{
	public int age;
	public String bookType;
	public void registerAccount(int age){
		this.age=age;
		if(age>12){
			System.out.println("");
			System.out.println("You have successfully registered under anAdult Account");
		}
		else{

			System.out.println("");
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
	}
	public void requestBook(String bookTypes){
		this.bookType=bookTypes;
		if(bookType.equals("Fiction")){
			System.out.println("");
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("");
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}
		
	}
	
}
