package com.ultramain.bank;

public class Bank{
	public static String bankName;
	private  long accountNumber;
	private  String userName;
	private float depositAmount;
	
	public  void setAccNumber(long accNumber){
		accountNumber=accNumber;
	}
	public  void setUserName(String user){
		userName=user;
	}
	public  void setDepositAmount(float amount){
		if(amount>0){
		depositAmount=depositAmount+amount;}
		else
		{
		System.out.println("Invalid value");
		}
	}
	//public static void viewBalance(long accNumber){
		//System.out.println("Balance  =  "+ depositAmount);
	//}
	public void withDrawal(float amount){
		if (amount<depositAmount){
			depositAmount=depositAmount-amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
		
	}
	public void viewBalance(){
		System.out.println("Bank name      :"+bankName);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("User Name      :"+userName);
		System.out.println("Balance        :"+depositAmount);
		System.out.println("...............................................................");
	}
}