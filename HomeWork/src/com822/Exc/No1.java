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
	
	/*10、以《剑指offer 名企面试官精讲典型编程题》 - 面试题12：打印1到最大的n位数为例。

	题目内容如下：

	输入数字n，按顺序打印出从1到最大的n位十进制数。
	比如输入3，则打印出1，2，3，... ，一直到最大的3位数即 999.*/
	public void no10()
	{
		int a=input.nextInt();
		
		String str="1";
		for(int i=0;i<a;i++)
		{
			str+=0;
		}
		
		BigInteger num1=new BigInteger("1");//每次加它
		BigInteger numMax=new BigInteger(str);
		BigInteger show=new BigInteger("1");//从一开始
		
		while(!show.equals(numMax))
		{
			System.out.println(show);
			show=show.add(num1);
		}		
//		System.out.println(str);				
	}
	
//	9、求91的92次方求它除以100的余数。
	public void no9()
	{
		BigInteger num=new BigInteger("91");
		num=num.pow(92);
		BigInteger[] nums=num.divideAndRemainder(new BigInteger("100"));
		
		System.out.println(nums[1]);
	}
	
/*	8、编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个，
	如"我ABC"4，应该截为"我AB"，输入"我ABC汉DEF"，6，应该输出为"我ABC"而不是"我ABC+汉的半个"。*/
	public  void no8()
	{
		String str="我是ab啊";
		int len=6;
		   
		for(int i=0;i<len;i++)
		{
			byte bt[] = (""+str.charAt(i)).getBytes(); // 将String转换成byte字节数组
			if(bt.length==2) len--;			
		}
	  
	    if (len > str.length())
	    {  
	    	len = str.length();  
	    }  
	    
	    String subStrx = str.substring(0, len);  
	    System.out.println(subStrx);	        	                    	    		
	}		
		
	
//	7、定义一个方法，接收一个数组，数组中存储10个学生考试分数，该方法要求返回考试分数最低的后三名考试分数。
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
	
//	6、将src数组中前3个元素，复制到dest数组的前3个位置上
	public  void no6()
	{
		int[] src= {1,2,5,6};
		int[] dest= {4,5,6,7,8,9};
		
		System.arraycopy(src, 0, dest, 0, 3); 
		
		System.out.println(Arrays.toString(dest));
	}
	
//	5、验证for循环打印数字1-9999所需要使用的时间（毫秒）
	public  void no5()
	{
		long time=System.currentTimeMillis();
		
		for(int i=0;i<9999;i++)
		{
			System.out.println(i);
		}
		
		time=System.currentTimeMillis()-time;
		System.out.println("时间："+time);

	}
	
	
	
//	4、int[] arr = {34,12,89,68};将一个int[]中元素转成字符串  格式 [34,12,89,68];
	public  void no4()
	{
		int[] arr = {34,12,89,68};
		System.out.println(Arrays.toString(arr));
	}
	
//	3、查询大字符串中，出现指定小字符串的次数。如“hellojava,nihaojava,javazhenbang”中查询出现“java”的次数。
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
			
		
		
		System.out.println("数量有： "+count);
	}
	
//	2、将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串。
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
	
	
//	1、获取指定字符串中，大写字母、小写字母、数字的个数。
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
		
		System.out.println("大写字母个数有："+upper);
		System.out.println("小写字母个数有："+lower);
		System.out.println("数字个数有： "+num);
	}

}
