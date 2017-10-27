package com904.E;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*��д�����߳�,һ���̴߳�ӡ1-52����������һ���̴߳�ӡ��ĸA-Z����ӡ˳��Ϊ
12A34B56C��.5152Z����������������ĸ��˳���С�����ӡ������ÿ��ӡ��������
�󣬴�ӡһ����ĸ������ѭ����ӡ��ֱ����ӡ������52����ĸZ������
6.
Ҫ��
1)��д��ӡ��Printer������˽������index����ʼֵΪ1��������ʾ�ǵڼ��δ�ӡ��
2)�ڴ�ӡ��Printer�б�д��ӡ���ֵķ���print(int i)��3�ı�����ʹ��wait()�����ȴ���
��������i��ʹ��notifyAll()���л��������̡߳�
3)�ڴ�ӡ��Printer�б�д��ӡ��ĸ�ķ���print(char c)������3�ı����͵ȴ�������ʹ�
ӡ�����ĸc��ʹ��notifyAll()���л��������̡߳�
4)��д��ӡ���ֵ��߳�NumberPrinter�̳�Thread�࣬����˽������private Printer p;
�ڹ��췽���н��и�ֵ��ʵ�ָ����run����������Printer���е�������ֵķ�����
5)��д��ӡ��ĸ���߳�LetterPrinter�̳�Thread�࣬����˽������private Printer p;��
���췽���н��и�ֵ��ʵ�ָ����run����������Printer���е������ĸ�ķ�����
6)��д������Test��������ӡ����󣬴��������߳�����������̡߳�*/
public class No6 {

	public static void main(String[] args) {
		Printer pri=new Printer();
		new LetterPrinter(pri).start();
		new NumberPrinter(pri).start();
	}

}

class Printer{
	private int index=1;
	final static ReentrantLock lock=new ReentrantLock();
	final static Condition con=lock.newCondition();
	
	public /*synchronized*/ void print(int i)
	{
		lock.lock();
		int ch=1;
		while(ch<=i)
		{
			if(index%3!=0)
			{
				System.out.print(ch);
				ch++;
				index++;
//				notify();
				con.signal();
			}
			else 
			{
				try {
					con.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
		lock.unlock();
		
	}
	public /*synchronized*/ void print(char c)
	{
		lock.lock();
		char ch='A';
		while(ch<=c)
		{
			if(index%3==0)
			{
				System.out.print(ch);
				ch++;
				index++;
//				notify();
				con.signal();
			}
			else 
			{
				try {
					con.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
		lock.unlock();
	}
}

class NumberPrinter extends Thread{
	private  Printer p;

	public NumberPrinter(Printer p) {
		this.p = p;
	}
	
	@Override
	public void run() {
//		lock.lock();
		p.print(52);
//		lock.unlock();
	}
}

class LetterPrinter extends Thread{
//	final static ReentrantLock lock=new ReentrantLock();
	private  Printer p;

	public LetterPrinter(Printer p) {
		this.p = p;
	}
	
	@Override
	public void run() {
//		lock.lock();
		p.print('Z');
//		lock.unlock();
	}
	
}