package com904.E;

import java.util.Random;

/*2. ���дһ���࣬����Ϊ MulThread,���庬һ���ַ����Ĺ��췽������ʵ��
Runnable�ӿڣ��ӿ��е� run()��������ʵ�֣�����������������ʾ���߳���Ϣ��
Ȼ���������С��һ���ʱ�䣬�����ʾ�߳̽�����Ϣ��finished+�߳�������
дһ��Application����������ͨ�� Runnable ����MUlThread ���������
�̶���T1��T2��T3���������������̡߳�*/
public class No2 {

	public static void main(String[] args) {
		new Thread(new MulThread("T1")).start();
		new Thread(new MulThread("T2")).start();
		new Thread(new MulThread("T3")).start();
	}

}

class MulThread implements Runnable{

	private String str;
	public MulThread(String str)
	{
//		System.out.println(Thread.currentThread());
//		Thread.currentThread().setName(str);
		this.str=str;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName(str);
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