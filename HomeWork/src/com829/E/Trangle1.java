package com829.E;
/*1��дһ������void isTriangle(int a,int b,int c)���ж����������Ƿ��ܹ���һ�������Σ� ��
���������׳��쳣IllegalArgumentException����ʾ�쳣��Ϣ ��a,b,c���ܹ��������Ρ�����
�����Թ�������ʾ�����������߳������������еõ���������������������� ���ô˷�����
�������쳣��*/
public class Trangle1 {

	public static void main(String[] args) {
		
		isTriangle(1,1,3);
	}
	
	public static void isTriangle(int a,int b,int c)
	{
		if(a+b<c||a+c<b||b+c<a)
		{
			throw new IllegalArgumentException("a,b,c���ܹ���������");
		}
		else {
			System.out.println("a: "+a+" b: "+b+" c: "+c);
		}
	}
	
	
}
