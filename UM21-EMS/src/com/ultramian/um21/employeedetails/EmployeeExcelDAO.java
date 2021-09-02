package com.ultramian.um21.employeedetails;

import java.util.ArrayList;
public class EmployeeExcelDAO {
	 public static void main(String[] args){
		   EmployeeBO empbo = new EmployeeBO();
		   ArrayList<EmployeeDto> result= empbo.addEmployees();
		   EmployeeService empser = new EmployeeService();
		   empser.Employee(result);
	   }
}
