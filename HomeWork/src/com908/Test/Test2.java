package com908.Test;
/*2、按要求编写一个Java应用程序：
(1)定义一个接口CanCry，描述会吼叫的方法public void cry()。
(2)分别定义狗类（Dog）和猫类（Cat），属性自定义，实现CanCry接口。实现方法的功能分别为：打印输出“我是狗，我的叫声是汪汪汪”、“我是猫，我的叫声是喵喵喵”。
(3)定义一个主类G， 
		①定义一个void makeCry(CanCry c)方法，其中让会吼叫的事物吼叫。
		②在main方法中创建狗类对象（dog）、猫类对象（cat）、G类对象（g），用g调用makecry方法，让狗和猫吼叫。*/

public class Test2 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		Test2 g=new Test2();
		
		g.makeCry(cat);
		g.makeCry(dog);
	}

	public void makeCry(CanCry c)
	{
		c.cry();
	}
}

interface CanCry{
	public void cry();
}

class Cat implements CanCry{
	private String name;
	private int age;
	
	
	public Cat() {
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void cry() {
		System.out.println("我是猫，我的叫声是喵喵喵");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Dog implements CanCry{
	private String name;
	private int age;
	
	
	public Dog() {
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void cry() {
		System.out.println("我是狗，我的叫声是汪汪汪");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}