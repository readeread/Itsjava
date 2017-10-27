/*��2������Role��������һ��"Employee"�࣬�������Role������г�Ա�����췽�����⣩��
����չsalary��Ա������ͬʱ����һ����̬��Ա������ְλ��ţ�ID������
	ͬ��Ҫ�������������췽����Ҫ���ֳ�this��super�ļ����÷�����Ҫ�󸲸�play()���������ṩһ��final sing()������*/
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
