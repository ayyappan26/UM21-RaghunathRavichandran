package com.um.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.um.dao.IDao;
import com.um.dto.EmpDto;
import com.um.factory.AbstractFactory;
import com.um.utility.Scan;

public class EmpBO {
	public void viewEmployeesByDepartment(){
		System.out.println("Enter the department Name : ");
		Scanner scan = Scan.getScannerInstance();
		String departmentName =scan.next();
		ArrayList<EmpDto>empList= null;
		
		AbstractFactory factory = AbstractFactory.getFactory(1); // new OracleFactory();
		IDao dao = factory.getDao(); // new OracleDao();
		
		try {
			empList = dao.viewEmployeesByDepartment(departmentName);
			if(!empList.isEmpty()){
				for(EmpDto empDto : empList){
					System.out.println("Employee Id: " + empDto.getEmployeeId());
					System.out.println("First Name : " + empDto.getFirstName());
					System.out.println("Last Name : " + empDto.getLastName());
					System.out.println("Salary : " + empDto.getSalary());
					System.out.println("Department Id :" + empDto.getDepartmentId());
					System.out.println("----------------------------------------------");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
