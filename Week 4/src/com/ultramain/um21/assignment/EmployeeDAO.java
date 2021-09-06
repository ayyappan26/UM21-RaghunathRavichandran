package com.ultramain.um21.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;




public class EmployeeDAO {
	HashMap<Integer,EmployeeDTO> hash = new HashMap<>();
	public HashMap<Integer,EmployeeDTO> viewEmployees() throws SQLException{
		EmployeeDTO empdto = new EmployeeDTO();
		
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * from emp";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery(sqlQuery);

		int empId;
		String firstName;
		String lastName;
		float salary;
		int mobile;
		String dept;

		while (rs.next()) {
			empId = rs.getInt(1);
			firstName = rs.getString(2);
			lastName = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);
		
			empdto.setEmployeeId(empId);
			empdto.setFirstName(firstName);
			empdto.setLastName(lastName);
			empdto.setSalary(salary);
			empdto.setMobile(mobile);
			empdto.setDepartment(dept);
			
			hash.put(empId,empdto);
			
			
	}
		return hash;
	}
	public void oneEmployee() {
		// TODO Auto-generated method stub
		
	}
	public void registerEmployee(EmployeeDTO empDto) {
		// TODO Auto-generated method stub
		
	}

}