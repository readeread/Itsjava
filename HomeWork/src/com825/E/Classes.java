package com825.E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/*4、创建一个接口IStudent，接口中有方法：
setName,getName,setAge,getAge,setScore,getScore,print,其他自定义。
创建这个接口的三个子类：
中国学生：
属性：自定义。
方法：说中文。
日本学生：
属性：
方法：说日文。
美国学生：
属性：
方法：说英文。
创建一个班级类，班级类管理上面三种学生若干名。能够按照Score对学生从高到低排序，能够打印所有学生的信息。*/
public class Classes {
	final List<IStudent> list=new ArrayList<>();
	public static void main(String[] args) {
		Classes c=new Classes();
		c.list.add(new Chinse("li",4,781));
		c.list.add(new Janpan("welson",4,78));
		c.list.add(new Chinse("wang",4,786));
		c.list.add(new Janpan("jack",4,785));
		c.list.add(new Chinse("zhang",4,784));
		c.list.add(new USA("wu",4,783));
		c.list.add(new USA("ke",4,782));
		
		/*Collections.sort(c.list,new Comparator<IStudent>() {

			@Override
			public int compare(IStudent o1, IStudent o2) {
				if(o1.getScore()<o2.getScore()) return 1;
				else if(o1.getScore()>o2.getScore()) return -1;
				return 0;
			}

		});*/
		
		Collections.sort(c.list,(o1,o2)->{
			if(o1.getScore()<o2.getScore()) return 1;
			else if(o1.getScore()>o2.getScore()) return -1;
			return 0;
		});
		
		ListIterator<IStudent> lis=c.list.listIterator();
		while(lis.hasNext())
		{
			System.out.println(lis.next());
		}
		
	}
}

interface IStudent{
	
	void setName(String str);
	String getName();
	void setAge(int a);
	int getAge();
	void setScore(double d);
	double getScore();
	void print();
}

class Chinse implements IStudent{
	private String name;
	private int age;
	private double score;
	
	
	public Chinse(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public void print() {
		System.out.println("我说中文");
	}


	@Override
	public String toString() {
		return "Chinse [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}

class Janpan implements IStudent{
	private String name;
	private int age;
	private double score;
	
	
	public Janpan(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public void print() {
		System.out.println("我说日语");
	}


	@Override
	public String toString() {
		return "Janpan [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}

class USA implements IStudent{
	private String name;
	private int age;
	private double score;
	
	
	public USA(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public void print() {
		System.out.println("我说英文");
	}


	@Override
	public String toString() {
		return "USA [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}