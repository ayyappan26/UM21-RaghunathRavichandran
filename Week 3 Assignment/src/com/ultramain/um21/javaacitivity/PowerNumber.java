package com.ultramain.um21.javaacitivity;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args){
		PowerNumber power = new PowerNumber();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		if(power.checkNumber(number))
		{
			System.out.println("The number " + number + " is power of Two ");
		}
		else
		{
			System.out.println("The number " + number + " is not power of Two ");
		}
		
		scanner.close();
	}

public static boolean checkNumber(int n){
	while(n != 1 ) 
	{
		if(n % 2 != 0)
		{
			return false;
		}
		n = n/ 2;
	}
	
	return true;
	
	}
}