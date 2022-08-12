package org.sample;

public class Employe2{
	//employee role and company name
	public void employeeRole() {
		System.out.println("employee role is engineer");
	}
public void employeeCompany() {
	System.out.println("company name is cts");
}
public static void main(String[] args) {
	Employe2 em = new Employe2();
	
	em.employeeRole();
	em.employeeCompany();
	
	Employee me = new Employee();
	
	me.empId();
	me.empName();
}
}
