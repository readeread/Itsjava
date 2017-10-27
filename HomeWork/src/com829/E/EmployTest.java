package com829.E;

import java.io.IOException;
import java.util.zip.DataFormatException;

/*4、编写一个员工类，
(1) 有属性：
编号，姓名，年龄，工资，身份证号码，员工人数，员工工资总额
(2) 有构造器：
构造器1：设置编号，年龄，姓名；如果年龄小于18，抛出年龄低异常；如果年龄大于60
抛出年龄高异常，如果姓名为null或为空字符串，抛出空异常。
构造器2：设置工资，设置身份证号码；如果工资低于600，抛出工资低异常。
(3) 有方法
增加工资 addSalary(double addSalary)，抛出工资高异常，当增加后的工资大于员工工资
总额时，抛出此异常。
减少工资 minusSalary(double minusSalary), 抛出工资低异常，当减少后的工资低于政府最
低工资时，抛出工资低异常。
显示员工工资总额方法：showTotalSalary(), 抛出空异常，当工资总额为0时，抛出此异常。
显示员工人数：void showTotalEmployee（），抛出空异常。当员工人数为0时，抛出此异
常。*/
public class EmployTest {

	public static void main(String[] args) {

	}

}

class Employy {
	private int num;
	private String name;
	private int age;
	private double salary;
	private int ID;
	private int count;
	private double allSalary;

	public Employy(int num, String name, int age) {

		try {
			setAge(age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			setName(name);
		} catch (DataFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.num = num;
	}

	public Employy(double salary, int iD) {

		try {
			setSalary(salary);
		} catch (DataFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ID = iD;
	}

	
	public void showTotalEmployee()
	{
		if(count==0)
		{
			try {
				throw new IOException("不行啊 没人");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("allPeople: "+count);
	}
	
	public void showTotalSalary()
	{
		if(allSalary==0)
		{
			try {
				throw new IOException("不行啊 好抠门");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("all: "+allSalary);
	}
	
	public void  minusSalary(double minusSalary)
	{
		try {
			setSalary(getSalary()-minusSalary);
		} catch (DataFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSalary(double addSalary)
	{
		try {
			setSalary(getSalary()+addSalary);
		} catch (DataFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws DataFormatException {
		if (name == null || name.equals("")) {
			throw new DataFormatException("");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IOException, DataFormatException {
		if (age < 18) {
			throw new DataFormatException("年龄太低");
		}

		if (age > 60) {
			throw new IOException("年龄太高");
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws DataFormatException, IOException {
		if (salary < 600) {
			throw new DataFormatException("工资好低");
		}

		if (salary > getAllSalary()) {
			throw new IOException("工资太高");
		}
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getAllSalary() {
		return allSalary;
	}

	public void setAllSalary(double allSalary) {
		this.allSalary = allSalary;
	}
}