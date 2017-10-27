package com908.Test;
/*2����Ҫ���дһ��JavaӦ�ó���
(1)����һ���ӿ�CanCry���������еķ���public void cry()��
(2)�ֱ��幷�ࣨDog����è�ࣨCat���������Զ��壬ʵ��CanCry�ӿڡ�ʵ�ַ����Ĺ��ֱܷ�Ϊ����ӡ��������ǹ����ҵĽ���������������������è���ҵĽ���������������
(3)����һ������G�� 
		�ٶ���һ��void makeCry(CanCry c)�����������û��е������С�
		����main�����д����������dog����è�����cat����G�����g������g����makecry�������ù���è��С�*/

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
		System.out.println("����è���ҵĽ�����������");
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
		System.out.println("���ǹ����ҵĽ�����������");
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