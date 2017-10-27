/*（2）、从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
并扩展salary成员变量，同时增加一个静态成员变量“职位编号（ID）”。
	同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法，并提供一个final sing()方法。*/
package com817.Exc6;

public class Employee extends Role {
	private static int ID=12;
	private int salary;

	public Employee() {
	}

	public Employee(String name, int age, String gender, int salary) {
		super(name, age, gender);
		this.salary = salary;
	}

	@Override
	public void play() {
		System.out.println("paly nothing!!");
	}
	
	 final public void sing()
	{
		System.out.println("Em sing hello!");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
