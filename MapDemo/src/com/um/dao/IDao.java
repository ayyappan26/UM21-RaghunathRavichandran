package com.um.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.um.dto.EmpDto;

public interface IDao {
	
	public ArrayList<EmpDto> viewEmployeesByDepartment(String departmentName) throws SQLException ;


}
