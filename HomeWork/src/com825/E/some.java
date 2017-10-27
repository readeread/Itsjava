package com825.E;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class some {
	public static void main(String[] args) {
		some s=new some();
		Collection<String> coll=new ArrayList<>();
		coll.add("a");
		coll.add("a");
		coll.add("a");
		s.show(coll);
		
		Collection<Integer> coll1=new HashSet<>();
		coll1.add(1);
		coll1.add(2);
		coll1.add(3156);
		coll1.add(4);
		coll1.add(5);
		s.show(coll1);
		
		TT animal=new TT();
		animal.show(new Pig<String>());
		animal.show(new dog<String>());
	}
	
	public void show(Collection<?> coll)
	{
		Iterator<?> iter=coll.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}

//写一个猪类，使用泛型，再写一个测试类，一个测试方法，能够打印所有动物集合的信息。
class Pig<T> extends Animal<T>
{
}
class dog<T> extends Animal<T>
{
}
 
class Animal<T>{
	T name;
	public void show()
	{
		System.out.println(this.getClass().getName());
	}
}

class TT
{
	
	public<T> void show(T t)
	{
		((Animal)t).show();
	}
}