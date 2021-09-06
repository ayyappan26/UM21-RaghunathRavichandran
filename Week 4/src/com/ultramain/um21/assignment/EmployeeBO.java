package com.ultramain.um21.assignment;


import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeBO 
{
	
	public void empSystem() throws SQLException{
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmployeeDAO dao=new EmployeeDAO();
		do{
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. View Specific Employee");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		}while(choice ==0);
		
		switch(choice){
		case 1:
			viewEmployees(dao);
			break;
		case 2:
			registerEmployee(dao);
			break;
		case 3:
			 oneEmployee(dao);
			break;
		case 4:
			return;
		}
	}
	
	public void oneEmployee(EmployeeDAO dao) throws SQLException {
		dao.oneEmployee();
		
	}

	public void viewEmployees(EmployeeDAO dao){
		try {
			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void registerEmployee(EmployeeDAO dao){
		EmployeeDTO empDto = getEmpDetails();
		dao.registerEmployee(empDto);
		
	}
	
	private EmployeeDTO getEmpDetails()
	{
		Scanner scan = Scan.getScannerInstance();
		EmployeeDTO empDto = new EmployeeDTO();
		System.out.println("Enter Employee Id: ");
		empDto.setEmployeeId(scan.nextInt());
		System.out.println("Enter First Name : ");
		empDto.setFirstName(scan.next());
		System.out.println("Enter Last Name : ");
		empDto.setLastName(scan.next());
		System.out.println("Enter Salary : ");
		empDto.setSalary(scan.nextFloat());
		System.out.println("Enter Mobile : ");
		empDto.setMobile(scan.nextInt());
		System.out.println("Enter Department : ");
		empDto.setDepartment(scan.next());		
		return empDto;
	}
	
}

