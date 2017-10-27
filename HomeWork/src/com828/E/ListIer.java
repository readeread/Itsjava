package com828.E;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIer {
	
	public static void main(String[] args) {
		ListIer lis=new ListIer();
		List<Dog> coll1=new ArrayList<>();
		coll1.add(new Dog(1,"小花","泰迪"));
		coll1.add(new Dog(2,"小明","牧羊犬"));
		coll1.add(new Dog(3,"小美","拉布拉多"));
		coll1.add(new Dog(4,"小红","泰迪"));
		
		List<Dog> coll=new LinkedList<>();
		coll.add(new Dog(1,"小花","泰迪"));
		coll.add(new Dog(2,"小明","牧羊犬"));
		coll.add(new Dog(3,"小美","拉布拉多"));
		coll.add(new Dog(4,"小红","泰迪"));
		
		System.out.println(((LinkedList<Dog>) coll).element().getName());
		
		lis.show(coll1);
		lis.delate(coll1);
		coll1.add(new Dog(3,"小美","拉布拉多"));
		lis.show(coll1);
	}
	
	public void delate(List<Dog> coll1)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要删除的小狗的信息：");
		int a=input.nextInt();
		coll1.remove(a-1);
		
		
		System.out.println("剩下的小狗是");
		System.out.println("序号        名字        品种  ");
		ListIterator<Dog> list=coll1.listIterator();
		while(list.hasNext())
		{
			Dog dog=list.next();
			System.out.println(dog.getId()+"  "+dog.getName()+"  "+dog.getType());
		}
	}

	public void show(List<Dog> coll1)
	{
		System.out.println("总共有"+coll1.size()+"条小狗");
		System.out.println("序号        名字        品种  ");
		ListIterator<Dog> list=coll1.listIterator();
		while(list.hasNext())
		{
			Dog dog=list.next();
			System.out.println(dog.getId()+"  "+dog.getName()+"  "+dog.getType());
		}
	}
	
}

class Dog{
	private int id;
	private String name;
	private String type;
	
	public Dog(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}