package com822.Exc;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class No1 {
	Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
		No1 no=new No1();
		no.no8();
		
	}
	
	/*10���ԡ���ָoffer �������Թپ������ͱ���⡷ - ������12����ӡ1������nλ��Ϊ����

	��Ŀ�������£�

	��������n����˳���ӡ����1������nλʮ��������
	��������3�����ӡ��1��2��3��... ��һֱ������3λ���� 999.*/
	public void no10()
	{
		int a=input.nextInt();
		
		String str="1";
		for(int i=0;i<a;i++)
		{
			str+=0;
		}
		
		BigInteger num1=new BigInteger("1");//ÿ�μ���
		BigInteger numMax=new BigInteger(str);
		BigInteger show=new BigInteger("1");//��һ��ʼ
		
		while(!show.equals(numMax))
		{
			System.out.println(show);
			show=show.add(num1);
		}		
//		System.out.println(str);				
	}
	
//	9����91��92�η���������100��������
	public void no9()
	{
		BigInteger num=new BigInteger("91");
		num=num.pow(92);
		BigInteger[] nums=num.divideAndRemainder(new BigInteger("100"));
		
		System.out.println(nums[1]);
	}
	
/*	8����дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ���������Ҫ��֤���ֲ����ذ����
	��"��ABC"4��Ӧ�ý�Ϊ"��AB"������"��ABC��DEF"��6��Ӧ�����Ϊ"��ABC"������"��ABC+���İ��"��*/
	public  void no8()
	{
		String str="����ab��";
		int len=6;
		   
		for(int i=0;i<len;i++)
		{
			byte bt[] = (""+str.charAt(i)).getBytes(); // ��Stringת����byte�ֽ�����
			if(bt.length==2) len--;			
		}
	  
	    if (len > str.length())
	    {  
	    	len = str.length();  
	    }  
	    
	    String subStrx = str.substring(0, len);  
	    System.out.println(subStrx);	        	                    	    		
	}		
		
	
//	7������һ������������һ�����飬�����д洢10��ѧ�����Է������÷���Ҫ�󷵻ؿ��Է�����͵ĺ��������Է�����
	public  void no7()
	{
		int[] arr= {1,2,3,4,5,3,6,8,7,9};
		System.out.println(Arrays.toString(no7_1(arr)));
	}
	public int[] no7_1(int [] arr)
	{
		int[] a=new int[3];
		
		Arrays.sort(arr);
		System.arraycopy(arr, 0, a, 0, 3); 
		
		return a;
	}
	
//	6����src������ǰ3��Ԫ�أ����Ƶ�dest�����ǰ3��λ����
	public  void no6()
	{
		int[] src= {1,2,5,6};
		int[] dest= {4,5,6,7,8,9};
		
		System.arraycopy(src, 0, dest, 0, 3); 
		
		System.out.println(Arrays.toString(dest));
	}
	
//	5����֤forѭ����ӡ����1-9999����Ҫʹ�õ�ʱ�䣨���룩
	public  void no5()
	{
		long time=System.currentTimeMillis();
		
		for(int i=0;i<9999;i++)
		{
			System.out.println(i);
		}
		
		time=System.currentTimeMillis()-time;
		System.out.println("ʱ�䣺"+time);

	}
	
	
	
//	4��int[] arr = {34,12,89,68};��һ��int[]��Ԫ��ת���ַ���  ��ʽ [34,12,89,68];
	public  void no4()
	{
		int[] arr = {34,12,89,68};
		System.out.println(Arrays.toString(arr));
	}
	
//	3����ѯ���ַ����У�����ָ��С�ַ����Ĵ������硰hellojava,nihaojava,javazhenbang���в�ѯ���֡�java���Ĵ�����
	public  void no3()
	{
		String str="hellojava,nihaojava,javazhenbang";
		String a="java";
		int count=0;
		
		int i=0;
		while(i<str.length())
		{
			if(str.regionMatches(i++, a, 0, 4)) count++;
		}
			
		
		
		System.out.println("�����У� "+count);
	}
	
//	2�����ַ����У���һ����ĸת���ɴ�д��������ĸת����Сд������ӡ�ı����ַ�����
	public void no2()
	{
		String str="hello";
		
		String a=str.substring(0,1);
		a=a.toUpperCase();
		String b=str.substring(1);
		b=b.toLowerCase();
		
		a=a.concat(b);
		System.out.println(a);
		

	}
	
	
//	1����ȡָ���ַ����У���д��ĸ��Сд��ĸ�����ֵĸ�����
	public void no1()
	{
		String str="Hello my Name Is Secret,123456";
		
		int num=0,upper=0,lower=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num++;
			}
			
			if(Character.isUpperCase(str.charAt(i)))
			{
				upper++;
			}
			
			if(Character.isLowerCase(str.charAt(i)))
			{
				lower++;
			}
		}
		
		System.out.println("��д��ĸ�����У�"+upper);
		System.out.println("Сд��ĸ�����У�"+lower);
		System.out.println("���ָ����У� "+num);
	}

}
