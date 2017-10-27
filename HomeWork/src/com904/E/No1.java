package com904.E;

import java.util.Random;

/*1. ���дһ���࣬����Ϊ SubThread, �� Thread ������ࡣ�����ж�����
��һ���ַ��������Ĺ��췽���� run()��������������һ�� forѭ����ѭ��һ��
����5�Σ�ѭ����������������ʾ���߳�ѭ���˵ڼ��Σ�Ȼ���������С��һ��
��ʱ�䣬ѭ����������ʾ�߳̽�����Ϣ���߳���+finished �� ��дһ��
Application���򣬲������д��� SubThread ��������̶߳���T1��T2��T3��
���ǵ����Ʒֱ�ΪFrist,Second,Third,�������������߳�*/
public class No1 {
	public static void main(String[] args) {
		new SubThread("First").start();
		new SubThread("Second").start();
		new SubThread("Third").start();
	}
	
}
 
class SubThread extends Thread{
	public SubThread(String str)
	{
		super(str);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("ѭ���Ĵ���: "+i);
			try {
				Thread.sleep(new Random().nextInt(1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}