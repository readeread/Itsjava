/*����һ�������"Role"�࣬�����������䣬�Ա�ȳ�Ա����
��1����Ҫ�󾡿����������б���(�ܹ�˽�о�˽��,�ܹ������Ͳ�Ҫ����)����ͨ��GetXXX()��SetXXX()�����Ը��������ж�д��
	����һ�������play()�������÷����������κ�ֵ��ͬʱ���ٶ����������췽����Role����Ҫ���ֳ�this�ļ����÷���*/
package com817.Exc6;

public abstract class Role {
	private String name;
	private int age;
	private String gender;

	public Role() {

	}

	public Role(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public abstract void play();

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
