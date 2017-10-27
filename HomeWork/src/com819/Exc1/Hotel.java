package com819.Exc1;
interface VIP{
	void VipService();
}

public class Hotel {
	private Employee[] e;
	
	public Hotel(int a) {
		this.e = new Employee[a];
	}

	public void addEmp(Employee emp)
	{
		if(e[e.length-1]!=null)
		{
			System.out.println("人员招满");
			return;
		}
		
		for(int i=0;i<e.length;i++)
		{
			if(e[i]==null)
			{
				e[i]=emp;
				return;
			}
		}
	}
	
	public void seeJob()
	{
		for(int i=0;e[i]!=null&&i<e.length;i++)
		{
			e[i].job();
		}
	}
	
	public void seeVIP()
	{
		for(int i=0;e[i]!=null&&i<e.length;i++)
		{
			if(e[i] instanceof VIP)
			{
				((VIP)e[i]).VipService();
			}
		}
	}
	
	public Employee getLucky() 
	{
		int j;
		for(j=0;j<e.length;j++)
		{
			if(e[j]==null)
			{
				break;
			}
		}
		int i=(int)(Math.random()*j);
		return e[i];
	}
	
	public Employee[] getE() {
		return e;
	}

	public void setE(Employee[] e) {
		this.e = e;
	}
}

abstract class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract void job();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class Chief extends Employee  implements VIP{

	public Chief(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		System.out.println("我的工作是做菜");
	}
	
	@Override
	public void VipService() {
		System.out.println("加菜");
	}
}

class Waiter extends Employee implements VIP{

	public Waiter(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		System.out.println(getName()+"的工作是上菜");
	}

	@Override
	public void VipService() {
			System.out.println("倒酒");
	}
}

class Manager extends Employee {
	private double bonus;

	public Manager(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		System.out.println("我的工作是管理");
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


}