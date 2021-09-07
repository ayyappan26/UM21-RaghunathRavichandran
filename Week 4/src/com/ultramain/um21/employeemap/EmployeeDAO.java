package com.ultramain.um21.employeemap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import sqlconnection.ConnectionTest;

public class EmployeeDAO {
	public HashMap<Integer,EmployeeDTO> viewEmployees() throws SQLException{
		Connection con=ConnectionTest.getDbConnection();
		HashMap<Integer,EmployeeDTO> empmap=new HashMap<Integer,EmployeeDTO>();
		String sqlQuery="SELECT * FROM emp";
		PreparedStatement pst=con.prepareStatement(sqlQuery);
		ResultSet rs=pst.executeQuery();
		EmployeeDTO empdto=null;
		int employeeId;
		while(rs.next()){
			empdto=new EmployeeDTO();
			employeeId=rs.getInt(1);
			empdto.setEmployeeId(rs.getInt(1));
			empdto.setFirstName(rs.getString(2));
			empdto.setLastName(rs.getString(3));
			empdto.setSalary(rs.getFloat(4));
			empdto.setMobile(rs.getInt(5));
			empdto.setDepartment(rs.getString(6));
			empmap.put(employeeId, empdto);
			}
		return empmap;
	}
	public HashMap<Integer,EmployeeDTO> viewOneEmployee() throws SQLException{
		Scanner scan=Scan.getScannerInstance();
		HashMap<Integer,EmployeeDTO> empmap=new HashMap<Integer,EmployeeDTO>();
		EmployeeDTO empdto= new EmployeeDTO();
		System.out.println("Enter Employee ID :");
		int b=scan.nextInt();
		Connection con=ConnectionTest.getDbConnection();
		String sql="SELECT Employee_id,First_name,Last_name,Salary,Mobileno,Department FROM emp WHERE Employee_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, b);
		ResultSet rs=pst.executeQuery();
		rs.next();
		empdto.setEmployeeId(rs.getInt(1));
		empdto.setFirstName(rs.getString(2));
		empdto.setLastName(rs.getString(3));
		empdto.setSalary(rs.getFloat(4));
		empdto.setMobile(rs.getInt(5));
		empdto.setDepartment(rs.getString(6));
		empmap.put(b, empdto);
		return empmap;
	}
	public void printDetails(HashMap<Integer,EmployeeDTO> resultMap){
		for(Integer key : resultMap.keySet() ) {
			System.out.println("Employee ID            : "+ key);
			System.out.println("Employee First Name    : "+((EmployeeDTO) resultMap.get(key)).getFirstName());
			System.out.println("Employee Last Name     : "+((EmployeeDTO) resultMap.get(key)).getLastName());
			System.out.println("Employee Salary        : "+((EmployeeDTO) resultMap.get(key)).getSalary());
			System.out.println("Employee Mobile No.    : "+((EmployeeDTO) resultMap.get(key)).getMobile());
			System.out.println("Employee Department    :"+((EmployeeDTO) resultMap.get(key)).getDepartment());
			System.out.println("-----------------------------------------");
	}

}
}
