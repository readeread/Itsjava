package com824.Exc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class Collect {

	public static void main(String[] args) {
		Collect co=new Collect();
		
		co.no4();
		co.no3();
		
	}

	/*4��ʹ����ǿ��forѭ����������
	4.1 ����˵��
	ʹ��foreachѭ�����������е�Ԫ�أ���ϸҪ�����£�
	ʹ��HashSet��������c,���ַ�����java������cpp������php������c#������objective-c�����뼯���С�
	ʹ��foreachѭ�����������е�ÿһ��Ԫ�أ�����ÿһ���ַ���Ԫ��ת��Ϊ��д��ʽ��*/
	public void no4()
	{
		Collection<String> coll=new HashSet<>();
		Collection<String> coll1=new HashSet<>();
		coll.add("java");
		coll.add("cpp");
		coll.add("php");
		coll.add("c#");
		coll.add("objective-c");
		System.out.println(coll);
		
		coll.forEach(str->coll1.add(str.toUpperCase()));
		coll1.forEach(str->System.out.print(str+" "));
	}
	
	/*3��ʹ��Iterator��remove�����Ƴ�Ԫ��
	3.1 ����˵��
	ʹ��Iterator��remove�����Ƴ������е�Ԫ�أ���ϸҪ�����£�
	ʹ��HashSet��������c,���ַ�����java������cpp������php������c#������objective-c�����뼯���С�
	ɾ������c�а����ַ���c�����ַ���Ԫ�ء�*/
	public void no3()
	{
		Collection<String> coll=new HashSet<>();
		coll.add("java");
		coll.add("cpp");
		coll.add("php");
		coll.add("c#");
		coll.add("objective-c");
		System.out.println(coll);
		
		/*Iterator<String> iter=coll.iterator();
		while(true)
		{
			if(!iter.hasNext())
			{
				break;
			}
			
			String str=iter.next();
			if(!str.matches("[^c]*"))
			{
				iter.remove();
			}
		}
		System.out.println(coll);*/
		
		/*Stream<String> stream=coll.stream();
		stream.filter(str->str.matches("[^c]*")).forEach(str->System.out.print(str+" "));*/
		
		coll.removeIf(str->str.contains("c"));
		System.out.println(coll);
		
	}
	
	/*2��ʹ��Iterator��hasNext������next������������
	2.1 ����˵��
	ʹ��Iterator��hasNext������next�����������ϣ���ϸҪ�����£�
	ʹ��HashSet��������c,���ַ�����java������cpp������php������c#������objective-c�����뼯���С�
	���������е�ÿһ��Ԫ�أ������*/
	public void no2()
	{
		Collection<String> coll=new HashSet<>();
		coll.add("java");
		coll.add("cpp");
		coll.add("php");
		coll.add("c#");
		coll.add("objective-c");
		System.out.println(coll);
		
		Iterator<String> iter=coll.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
/*	1�����Է���addAll ��containsAll���÷�
	1.1 ����˵��
	����Collection�ӿ���addAll������containsAll�������÷�����ϸҪ�����£�
	ʹ��ArrayList��������c1,���ַ�����java������cpp������php������c#������objective-c�����뼯��c1�в����c1��
	ʹ��HashSet��������c2��������c1�е�Ԫ����ӵ�����c2,���������c2.
	ʹ��ArrayList��������c3�����ַ�����java������cpp�����뼯��c3�У����жϼ���c1���Ƿ��������c3��*/
	public void no1() {
		Collection<String> coll=new ArrayList<>();
		coll.add("java");
		coll.add("cpp");
		coll.add("php");
		coll.add("c#");
		coll.add("objective-c");
		System.out.println(coll);
		
		Collection<String> coll1=new ArrayList<>();
		coll1.addAll(coll);
		System.out.println(coll1);
		
		Collection<String> coll2=new ArrayList<>();
		coll2.add("java");
		coll2.add("cpp");
		System.out.println(coll.containsAll(coll2));		
	}
}
