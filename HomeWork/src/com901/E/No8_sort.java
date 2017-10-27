package com901.E;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为
exit退出；将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加
入到一个集合中，要求集合中的元素按照年龄大小正序排序；最后遍历集合，将集合中
学生信息写入到记事本，每个学生数据占单独一行。*/
public class No8_sort {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Student> al=new ArrayList<>();
		int i=1;
		
		outloop:
		while(true)
		{
			int a;
			while(true)
			{
				String temp;
				try {
					System.out.println("请输入第"+i+"个学生学号");
					temp=in.next();
					
					if(temp.equals("exit"))
					{
						break outloop;
					}
					
					a=Integer.decode(temp);
					break;
				}catch (NumberFormatException e) {
					System.out.println("学号只能是数字");
				}
			}
			
			System.out.println("请输入第"+i+"个学生姓名");
			String name=in.next();
			if(name.equals("exit")) break;
			
			int b;
			while(true)
			{
				String temp;
				try {
					System.out.println("请输入第"+i+"个学生年龄");
					temp=in.next();
					
					if(temp.equals("exit"))
					{
						break outloop;
					}
					
					b=Integer.decode(temp);
					break;
				}catch (NumberFormatException e) {
					System.out.println("年龄只能是数字");
				}
			}
			
			al.add(new Student(a, name, b));
			i++;
		}
		in.close();
		
		Collections.sort(al);
		/*Collections.sort(al, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getAge()>o2.getAge())
				{
					return 1;
				}
				else if(o1.getAge()<o2.getAge())
				{
					return -1;
				}
				return 0;
				
			}
		});*/
		
		
		Iterator<Student> iter=al.iterator();
		
		FileWriter fw=null;
		File file=new File("E:\\Student.txt");
		
		try {
			fw=new FileWriter(file);
			while(iter.hasNext())
			{
				Student stu=iter.next();
				
				fw.write(stu.getName());
				fw.write("  ");
				
				fw.write(String.valueOf(stu.getAge()));
				fw.write("  ");
				
				fw.write(String.valueOf(stu.getId()));
				fw.write("\r\n");
			}
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		if(this.getAge()<o.getAge())
		{
			return 1;
		}
		else if(this.getAge()>o.getAge())
		{
			return -1;
		}
		return 0;
	}
}