package org.tcs.test.login;

public class Employee {

	// Default constructor 
	public Employee() {
		System.out.println("default Constructer");
		
	}
	// parameterized constructor
	
	 public Employee(int id) {
		 System.out.println("int para constructer " +id);
}
	 private void empId() {
		System.out.println("method");

	}
	 public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1= new Employee(143);
		e.empId();
	}
}