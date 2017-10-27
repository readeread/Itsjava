package com829.E;

import java.util.Scanner;

/*2、编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N
个数。如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者
0”。并提示用户再次输入该数*/
public class Average2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true)
		{
			try {
				System.out.println("输入一个数N：");
				int a=input.nextInt();
				System.out.println("平均数是："+no2(a));
				break;
			} catch (Exception e) {
				System.out.println("N必须是正数或者0");
			}
		}
		
	}
	
	public static int no2(int n) throws Exception
	{
		if(n<0)
		{
			throw new Exception();
		}
		return n;
	}
}
