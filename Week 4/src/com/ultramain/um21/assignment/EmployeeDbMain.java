package com.ultramain.um21.assignment;

import java.sql.SQLException;

public class EmployeeDbMain {
	public static void main(String arg[]) throws SQLException{
		EmployeeBO empbo=new EmployeeBO();
		empbo.empSystem();
	}

}
