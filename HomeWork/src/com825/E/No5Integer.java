package com825.E;
/*5、编写一个泛型方法add()，当传入不同数字类型的值时，能够进行加法运算
（如可以传入int、long、float、double类型，但要对传入的值做一定的限定，如必须是数字）*/

public class No5Integer{

	public static void main(String[] args) {
		No5Integer no5=new No5Integer();
		System.out.println(no5.add(4,6));
	}
	
	public  <T extends Number> Object add(T t,T t1)
	{
		if(t.getClass().getName()=="java.lang.Double"||t1.getClass().getName()=="java.lang.Double")
		{
			return t1.doubleValue() + t.doubleValue();
		}
		return t1.intValue() + t.intValue();
	}

}
