/*（3）、"Manager"类继承"Employee"类，有一个final成员变量"vehicle"*/
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
