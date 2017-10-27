package com829.E;

import java.io.IOException;
import java.util.zip.DataFormatException;

/*4����дһ��Ա���࣬
(1) �����ԣ�
��ţ����������䣬���ʣ����֤���룬Ա��������Ա�������ܶ�
(2) �й�������
������1�����ñ�ţ����䣬�������������С��18���׳�������쳣������������60
�׳�������쳣���������Ϊnull��Ϊ���ַ������׳����쳣��
������2�����ù��ʣ��������֤���룻������ʵ���600���׳����ʵ��쳣��
(3) �з���
���ӹ��� addSalary(double addSalary)���׳����ʸ��쳣�������Ӻ�Ĺ��ʴ���Ա������
�ܶ�ʱ���׳����쳣��
���ٹ��� minusSalary(double minusSalary), �׳����ʵ��쳣�������ٺ�Ĺ��ʵ���������
�͹���ʱ���׳����ʵ��쳣��
��ʾԱ�������ܶ����showTotalSalary(), �׳����쳣���������ܶ�Ϊ0ʱ���׳����쳣��
��ʾԱ��������void showTotalEmployee�������׳����쳣����Ա������Ϊ0ʱ���׳�����
����*/
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
				throw new IOException("���а� û��");
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
				throw new IOException("���а� �ÿ���");
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
			throw new DataFormatException("����̫��");
		}

		if (age > 60) {
			throw new IOException("����̫��");
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws DataFormatException, IOException {
		if (salary < 600) {
			throw new DataFormatException("���ʺõ�");
		}

		if (salary > getAllSalary()) {
			throw new IOException("����̫��");
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