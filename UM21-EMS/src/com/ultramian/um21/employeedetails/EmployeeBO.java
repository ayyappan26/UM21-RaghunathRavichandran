package com.ultramian.um21.employeedetails;

import java.util.ArrayList;
public class EmployeeBO {
	 public ArrayList<EmployeeDto> addEmployees(){
    	 EmployeeDto emp1 = new EmployeeDto();
    	 emp1.setEmpID(101);
    	 emp1.setFirst_name("King");
    	 emp1.setLast_name("s");
    	 emp1.setSalary(45000);
    	 EmployeeDto emp2 = new EmployeeDto();
    	 emp2.setEmpID(102);
    	 emp2.setFirst_name("Queen");
    	 emp2.setLast_name("K");
    	 emp2.setSalary(55000);
    	 EmployeeDto emp3 = new EmployeeDto();
    	 emp3.setEmpID(103);
    	 emp3.setFirst_name("Raja");
    	 emp3.setLast_name("G");
    	 emp3.setSalary(65000);
    	 EmployeeDto emp4 = new EmployeeDto();
    	 emp4.setEmpID(104);
    	 emp4.setFirst_name("Raja");
    	 emp4.setLast_name("S");
    	 emp4.setSalary(75000);
    	 EmployeeDto emp5 = new EmployeeDto();
    	 emp5.setEmpID(105);
    	 emp5.setFirst_name("abc");
    	 emp5.setLast_name("R");
    	 emp5.setSalary(45000);
    	 ArrayList<EmployeeDto> details = new ArrayList<EmployeeDto>();
    	 details.add(emp1);
    	 details.add(emp2);
    	 details.add(emp3);
    	 details.add(emp4);
    	 details.add(emp5);
    	 return details;
     }
		
		

}
