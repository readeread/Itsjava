package com825.E;


/*7��**ʹ�÷��ͽӿڻ�������������Сֵ�������������£� 
��1���������ͽӿ� MaxOrMin������max��min�������󷽷��� 
	Interface MaxOrMin( T extends Comparable<T>){   
	 T min(T[] ts);    
	 T max(T[] ts); 
	 }  
 ��2������������ComparableElement,ʵ��MaxOrMin������  
 Class ComparableElement<T extends Comparable<T>> implements MaxOrMin<T>{}  
 ��3������������Test������һ��char���������Double�������飬��������������е����ֵ����Сֵ*/
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
