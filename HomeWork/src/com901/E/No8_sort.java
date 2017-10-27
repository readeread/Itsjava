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

/*�ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�ţ�������������Ϣ�������������Ϊ
exit�˳����������ѧ����Ϣ�ֱ��װ��һ��Student�����У��ٽ�ÿ��Student�����
�뵽һ�������У�Ҫ�󼯺��е�Ԫ�ذ��������С�����������������ϣ���������
ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ�С�*/
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
					System.out.println("�������"+i+"��ѧ��ѧ��");
					temp=in.next();
					
					if(temp.equals("exit"))
					{
						break outloop;
					}
					
					a=Integer.decode(temp);
					break;
				}catch (NumberFormatException e) {
					System.out.println("ѧ��ֻ��������");
				}
			}
			
			System.out.println("�������"+i+"��ѧ������");
			String name=in.next();
			if(name.equals("exit")) break;
			
			int b;
			while(true)
			{
				String temp;
				try {
					System.out.println("�������"+i+"��ѧ������");
					temp=in.next();
					
					if(temp.equals("exit"))
					{
						break outloop;
					}
					
					b=Integer.decode(temp);
					break;
				}catch (NumberFormatException e) {
					System.out.println("����ֻ��������");
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