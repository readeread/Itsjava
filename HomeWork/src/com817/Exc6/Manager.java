/*��3����"Manager"��̳�"Employee"�࣬��һ��final��Ա����"vehicle"*/
package com817.Exc6;

public class Manager extends Employee {
	private final String vehicle;

	public Manager() {
		vehicle="car";
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, String gender, int salary) {
		super(name, age, gender, salary);
		vehicle="car";
	}

	public String getVehicle() {
		return vehicle;
	}
	
//	public void sing() {}
	
}
