package com.ultramain.um21.assignment;

//import  com.ultramain.um21.assignment.Employee;
public class InheritanceActivity {
	public static void main(String args[])
	{
		Manager mg=new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Salary of the Manager              : "+mg.calculateSalary());
		System.out.println("---------------------------------------");
		Trainee tr=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Salary of the Trainee              : "+tr.calculateSalary());
		System.out.println("---------------------------------------");
		System.out.println("Transport allowance of manage      : "+mg.calculateTransportAllowance());
		System.out.println("---------------------------------------");
        System.out.println("Transport Allowance of trainee     : "+tr.calculateTransportAllowance());
	}
}
