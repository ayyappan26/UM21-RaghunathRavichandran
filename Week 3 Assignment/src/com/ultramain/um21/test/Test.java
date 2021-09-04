package com.ultramain.um21.test;

public class Test {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
    EmployeeService util=new EmployeeService();
    EmployeeDTO arr[]=util.getUserDetails();
    util.getEmployeeDetails(arr);
	}
}
