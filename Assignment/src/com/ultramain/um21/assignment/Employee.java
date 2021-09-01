package com.ultramain.um21.assignment;


public class Employee {
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance=250.80;
	public double Hra=1000.50;
	
	
	
	public  Employee(long empId, String empName, String empAddress, long empPhone){
		employeeId =empId;
		employeeName =empName;
		employeeAddress =empAddress;
		employeePhone= empPhone;
//		employeeSalary=empSalary;
		
		
		
	}
	public double calculateSalary(){
	double Salary = basicSalary + ( basicSalary * specialAllowance/100) + (basicSalary * Hra/100); 
//	System.out.println("Salary ...=" + Salary);
	return Salary;
	}
	public double calculataeTransportAllowance(){
		double transportAllowance=basicSalary*(10/100);
		return transportAllowance;
	}
	public double calculateTransportAllowance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class Manager extends Employee{

	public Manager(long empId, String empName, String empAddress, long empPhone,double Salary) {
		super(empId, empName, empAddress, empPhone);
		basicSalary=Salary;}
		// TODO Auto-generated constructor stub
		public double calculateTransportAllowance() {
			double transportAllowance=15*(basicSalary/100);
			return transportAllowance;
		}
	}
	

class Trainee extends Employee{

	public Trainee(long empId, String empName, String empAddress, long empPhone,double Salary) {
		super(empId, empName, empAddress, empPhone);
		basicSalary=Salary;
	}		// TODO Auto-generated constructor stub
	public double calculateTransportAllowance() {
			return super.calculateTransportAllowance();
		}
}	


