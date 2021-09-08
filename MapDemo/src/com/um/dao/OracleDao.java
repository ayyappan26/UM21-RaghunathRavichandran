package com.um.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.data.DataConnect;
import com.um.dto.EmpDto;

public class OracleDao implements IDao{

	public ArrayList<EmpDto> viewEmployeesByDepartment(String departmentName) throws SQLException {
		ArrayList<EmpDto> empList = null;
		boolean deptCheck = isDepartmentAvailable(departmentName);
		if(deptCheck==true){
			int deptId = 0;
			deptId = getDeptID(departmentName);
			empList = getEmpDetails(deptId);
		}else{
			System.out.println("Invalid department name...");
		}
		return empList;
	}

	private int getDeptID(String departmentName) throws SQLException {
		int deptId = 0;
		Connection con = DataConnect.getDbConnection();
		String deptQuery = "select department_id from departments where lower(department_name) = lower(?)";
		PreparedStatement pst = con.prepareStatement(deptQuery);
		pst.setString(1, departmentName);
		ResultSet deptResultSet = pst.executeQuery();
		
		while(deptResultSet.next()){
			deptId= deptResultSet.getInt(1);
		}
		return deptId;
	}
	
	private boolean isDepartmentAvailable(String departmentName) throws SQLException{
		 boolean status = false;
		 Connection con = DataConnect.getDbConnection();
		 String deptQuery = "select count(department_id) from departments where lower(department_name) = lower(?)";
		 PreparedStatement pst = con.prepareStatement(deptQuery);
			pst.setString(1, departmentName);
			ResultSet deptResultSet = pst.executeQuery();
			while(deptResultSet.next()){
				int count = deptResultSet.getInt(1);
				if(count!=0){
					status = true;
				}
			}
		 return status;
	}

	private ArrayList<EmpDto> getEmpDetails(int deptId) throws SQLException{
		ArrayList<EmpDto> empList = new ArrayList<>();
		//EmpDto dto  = new EmpDto();
		 Connection con = DataConnect.getDbConnection();
		 String deptQuery = "select employee_id, first_name,last_name,salary,department_id FROM employees WHERE department_id = ?";
		 PreparedStatement pst = con.prepareStatement(deptQuery);
			pst.setInt(1, deptId);
			ResultSet deptResultSet = pst.executeQuery();
			while(deptResultSet.next()){
				EmpDto empDto  = new EmpDto();
				empDto.setEmployeeId(deptResultSet.getInt(1));
				empDto.setFirstName(deptResultSet.getString(2));
				empDto.setLastName(deptResultSet.getString(3));
				empDto.setSalary(deptResultSet.getFloat(4));
				empDto.setDepartmentId(deptResultSet.getInt(5));
				empList.add(empDto);
			}
		
		return empList;
	}
}
