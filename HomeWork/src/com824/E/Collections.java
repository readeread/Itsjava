package com824.E;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class Collections {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		coll.add("我是Java");
		coll.add("我是C++");
		coll.add("我是Swithjava");
		coll.add("我是Swithjava");
		coll.add("我是Swithjava");
		coll.add("我是Swithjava");
		coll.add("我是Swith");
		coll.add("我是Swithj");
		
		System.out.println(coll);
		
		
		/*for(int i=0;i<coll.size();i++)
		{
			if(((ArrayList<String>) coll).get(i).length()<8)
			{
				coll.remove(((ArrayList<String>) coll).get(i));
				i--;
			}
		}*/
		
//		System.out.println(coll);
		Iterator<String> iter= coll.iterator();
		while(true)
		{
			if(!iter.hasNext())
			{
				break;
			}
			
			String str1=iter.next();
			if(str1.length()<8)
			{
				iter.remove();
			}
		}
		System.out.println();
		System.out.println(coll);
		
		Stream<String> s= coll.stream();
		long a=s.filter(str->str.contains("java")).count();
		System.out.println("aaaa=="+a);
		coll.forEach(strsss->System.out.print(strsss+"  "));
		
//		Collection<String> colls=(Collection<String>) ((ArrayList<String>) coll).clone();
//		System.out.println(colls);
		
		/*String[] str=coll.toArray(new String[0]);
		((ArrayList<String>) coll).set(1,"");
		System.out.println(coll);*/
		
		/*Iterator<String> iter= coll.iterator();
		while(iter.hasNext())
		{
			String str1=iter.next();
			System.out.println(str1);
			if(str1.equals("我是C++")) break;
		}
		
		while(iter.hasNext())
		{
			String str1=iter.next();
//			if(str1.equals("我是Swith")) break;
			System.out.println(str1);
		}
		
		for(String s:coll)
		{
			System.out.println(s);
		}*/
		Person<String> person=new Person<>();
		person.one="hahaha";
		System.out.println(person.one);
	}
	
	

}

class Person<T> {
	T one;
	int age;
}
