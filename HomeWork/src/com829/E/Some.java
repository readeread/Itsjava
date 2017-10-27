package com829.E;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Some {
	public static void main(String[] args) {
		Map<Student,Addr> map=new HashMap<>();
		
		map.put(new Student("zhang"), new Addr("queen"));
		map.put(new Student("san"), new Addr("queen"));
		map.put(new Student("feng"), new Addr("queen"));
		
		System.out.println(map.get(new Student("zhang")));
		
		Iterator<Map.Entry<Student,Addr>> iter=map.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry<Student, Addr> en=iter.next();
			System.out.println("kay:"+en.getKey()+"---value"+en.getValue());
		}
		
		
		try {
			set(0);
		} catch (Exception e) {
			System.out.println("aaaaaaaaaa");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("oooooooooooo");
		}
		
	}
	
	public static void set(int a) throws Exception
	{
		if(a==0)
		{
			throw new Exception("buxing a a a a ");
		}
	}
}

class Student{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}

class Addr{
	String addr;

	public Addr(String addr) {
		super();
		this.addr = addr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Addr other = (Addr) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Addr [addr=" + addr + "]";
	}
	
}