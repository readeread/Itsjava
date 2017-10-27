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

	/*4、使用增强型for循环遍历集合
	4.1 案例说明
	使用foreach循环遍历集合中的元素，详细要求如下：
	使用HashSet构建集合c,将字符串“java”、“cpp”、“php”、“c#”、“objective-c”放入集合中。
	使用foreach循环遍历集合中的每一个元素，并将每一个字符串元素转化为大写形式。*/
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
	
	/*3、使用Iterator的remove方法移除元素
	3.1 案例说明
	使用Iterator的remove方法移除集合中的元素，详细要求如下：
	使用HashSet构建集合c,将字符串“java”、“cpp”、“php”、“c#”、“objective-c”放入集合中。
	删除集合c中包含字符”c”的字符串元素。*/
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
	
	/*2、使用Iterator的hasNext方法，next方法遍历集合
	2.1 案例说明
	使用Iterator的hasNext方法、next方法遍历集合，详细要求如下：
	使用HashSet构建集合c,将字符串“java”、“cpp”、“php”、“c#”、“objective-c”放入集合中。
	遍历集合中的每一个元素，并输出*/
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
	
/*	1、测试方法addAll 、containsAll的用法
	1.1 案例说明
	测试Collection接口中addAll方法，containsAll方法的用法，详细要求如下：
	使用ArrayList构建集合c1,将字符串“java”、“cpp”、”php”、”c#”、“objective-c”放入集合c1中并输出c1。
	使用HashSet构建集合c2，将集合c1中的元素添加到集合c2,并输出集合c2.
	使用ArrayList构建集合c3，将字符串”java”、“cpp”放入集合c3中，并判断集合c1中是否包含集合c3。*/
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
