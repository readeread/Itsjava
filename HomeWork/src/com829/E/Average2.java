package com829.E;

import java.util.Scanner;

/*2����дһ������N������ƽ��ֵ�ĳ��򡣳���Ӧ����ʾ�û�����N��ֵ����α�����������N
����������û������ֵ��һ����������Ӧ���׳�һ���쳣��������ʾ��N��������������
0��������ʾ�û��ٴ��������*/
public class Average2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true)
		{
			try {
				System.out.println("����һ����N��");
				int a=input.nextInt();
				System.out.println("ƽ�����ǣ�"+no2(a));
				break;
			} catch (Exception e) {
				System.out.println("N��������������0");
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
