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
		coll1.add(new Dog(1,"С��","̩��"));
		coll1.add(new Dog(2,"С��","����Ȯ"));
		coll1.add(new Dog(3,"С��","��������"));
		coll1.add(new Dog(4,"С��","̩��"));
		
		List<Dog> coll=new LinkedList<>();
		coll.add(new Dog(1,"С��","̩��"));
		coll.add(new Dog(2,"С��","����Ȯ"));
		coll.add(new Dog(3,"С��","��������"));
		coll.add(new Dog(4,"С��","̩��"));
		
		System.out.println(((LinkedList<Dog>) coll).element().getName());
		
		lis.show(coll1);
		lis.delate(coll1);
		coll1.add(new Dog(3,"С��","��������"));
		lis.show(coll1);
	}
	
	public void delate(List<Dog> coll1)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫɾ����С������Ϣ��");
		int a=input.nextInt();
		coll1.remove(a-1);
		
		
		System.out.println("ʣ�µ�С����");
		System.out.println("���        ����        Ʒ��  ");
		ListIterator<Dog> list=coll1.listIterator();
		while(list.hasNext())
		{
			Dog dog=list.next();
			System.out.println(dog.getId()+"  "+dog.getName()+"  "+dog.getType());
		}
	}

	public void show(List<Dog> coll1)
	{
		System.out.println("�ܹ���"+coll1.size()+"��С��");
		System.out.println("���        ����        Ʒ��  ");
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