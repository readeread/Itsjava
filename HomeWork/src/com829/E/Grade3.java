package com829.E;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*3����д��������û����������Ϣ�����������0��100֮�䣬����ɼ�������ɼ����ڸ÷�
Χ�ڣ��׳��쳣��Ϣ����ʾ����������0��100֮�䡣
Ҫ��ʹ���Զ����쳣ʵ��*/
public class Grade3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] grade;
		
		int b=0;
		while(true)
		{	
			System.out.println("dsds");
				try {
				System.out.println("�������������ֱ�ʾ����");
				b=input.nextInt();
				grade=new int[b];
				break;
			}catch(InputMismatchException e){
				System.out.println("�������");
				input.next();
			
			}
		}
		
		for(int i=0;i<grade.length;i++)
		{
			System.out.println("������ɼ���");
			int a=0;
			
			while(true)
			{
				try {
					a=input.nextInt();
					break;
				}catch(InputMismatchException e){
					System.out.println("��������������");
					input.nextLine();
				}
			}
			
			
			if(a<0||a>100)
			{
				try {
					throw new IOException();
				} catch (IOException e) {
					System.out.println("���벻��ȷ������������0��100֮��");
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
