package com829.E;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*3、编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范
围内，抛出异常信息，提示分数必须在0—100之间。
要求：使用自定义异常实现*/
public class Grade3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] grade;
		
		int b=0;
		while(true)
		{	
			System.out.println("dsds");
				try {
				System.out.println("输入整数的数字表示人数");
				b=input.nextInt();
				grade=new int[b];
				break;
			}catch(InputMismatchException e){
				System.out.println("输入错误");
				input.next();
			
			}
		}
		
		for(int i=0;i<grade.length;i++)
		{
			System.out.println("亲输入成绩：");
			int a=0;
			
			while(true)
			{
				try {
					a=input.nextInt();
					break;
				}catch(InputMismatchException e){
					System.out.println("输入整数的数字");
					input.nextLine();
				}
			}
			
			
			if(a<0||a>100)
			{
				try {
					throw new IOException();
				} catch (IOException e) {
					System.out.println("输入不正确，分数必须在0—100之间");
					i--;
					continue;
				}
			}
			
			grade[i]=a;
		}
		
		for(int i:grade)
		{
			System.out.print(i+"  ");
		}
	}

}
