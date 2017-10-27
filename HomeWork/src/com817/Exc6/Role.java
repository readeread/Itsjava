/*定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
（1）、要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，再通过GetXXX()和SetXXX()方法对各变量进行读写。
	具有一个抽象的play()方法，该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。*/
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
