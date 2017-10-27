package com825.E;


/*7、**使用泛型接口获得数组的最大和最小值，操作步骤如下： 
（1）创建泛型接口 MaxOrMin，包含max和min两个抽象方法； 
	Interface MaxOrMin( T extends Comparable<T>){   
	 T min(T[] ts);    
	 T max(T[] ts); 
	 }  
 （2）创建泛型类ComparableElement,实现MaxOrMin方法；  
 Class ComparableElement<T extends Comparable<T>> implements MaxOrMin<T>{}  
 （3）创建测试类Test，包含一个char类型数组和Double类型数组，并输出两个数组中的最大值和最小值*/
public class TestMM {
	public static void main(String[] args) {
		Double[] dou= {1.2,5.5,2.3,5.1,8.1,8.0};
		Character[] ch= {'a','d','g','h','y'};
		
		ComparableElement<Character> com1=new ComparableElement<>();
		ComparableElement<Double> com2=new ComparableElement<>();
		System.out.println(com1.min(ch));
		System.out.println(com2.min(dou));
		System.out.println(com1.max(ch));
	}
	
}

interface MaxOrMin<T extends Comparable<T>>{   
	T min(T[] ts);    
	T max(T[] ts);
}

class ComparableElement<T extends Comparable<T>> implements MaxOrMin<T>{

	@Override
	public T min(T[] ts) {
		T t=ts[0];
		for(int i=0;i<ts.length;i++)
		{
			if(ts[i].compareTo(t)<0)
			{
				t=ts[i];
			}
		}
		return t;
	}

	@Override
	public T max(T[] ts) {
		T t=ts[0];
		for(int i=0;i<ts.length;i++)
		{
			if(ts[i].compareTo(t)>0)
			{
				t=ts[i];
			}
		}
		return t;
	}	
} 
