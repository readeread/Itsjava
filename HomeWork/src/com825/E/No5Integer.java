package com825.E;
/*5����дһ�����ͷ���add()�������벻ͬ�������͵�ֵʱ���ܹ����мӷ�����
������Դ���int��long��float��double���ͣ���Ҫ�Դ����ֵ��һ�����޶�������������֣�*/

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
