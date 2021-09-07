package com.ultramain.um21.employeemap;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
public class EmployeeBusiness {
	public void empSystem(){
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmployeeDAO dao=new EmployeeDAO();
		do{
			System.out.println("1. View Employee");
			System.out.println("2. View Specific Employee");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		}while(choice ==0);
		
		switch(choice){
		case 1:
			viewEmployees(dao);
			break;
		case 2:
			viewOneEmployee(dao);
			break;
		case 3:
			 return;
		}
	}
	public void viewEmployees(EmployeeDAO dao) {
		try{
			HashMap<Integer,EmployeeDTO> resultMap=new HashMap<Integer,EmployeeDTO>();
			resultMap=dao.viewEmployees();
			dao.printDetails(resultMap);
			
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}	
	}
	public void viewOneEmployee(EmployeeDAO dao) {
		try{
			HashMap<Integer,EmployeeDTO> resultMap=new HashMap<Integer,EmployeeDTO>();
			resultMap=dao.viewOneEmployee();
			dao.printDetails(resultMap);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}	
	}
}
	
