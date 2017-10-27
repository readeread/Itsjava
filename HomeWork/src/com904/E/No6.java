package com904.E;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*编写两个线程,一个线程打印1-52的整数，另一个线程打印字母A-Z。打印顺序为
12A34B56C….5152Z。即按照整数和字母的顺序从小到大打印，并且每打印两个整数
后，打印一个字母，交替循环打印，直到打印到整数52和字母Z结束。
6.
要求：
1)编写打印类Printer，声明私有属性index，初始值为1，用来表示是第几次打印。
2)在打印类Printer中编写打印数字的方法print(int i)，3的倍数就使用wait()方法等待，
否则就输出i，使用notifyAll()进行唤醒其它线程。
3)在打印类Printer中编写打印字母的方法print(char c)，不是3的倍数就等待，否则就打
印输出字母c，使用notifyAll()进行唤醒其它线程。
4)编写打印数字的线程NumberPrinter继承Thread类，声明私有属性private Printer p;
在构造方法中进行赋值，实现父类的run方法，调用Printer类中的输出数字的方法。
5)编写打印字母的线程LetterPrinter继承Thread类，声明私有属性private Printer p;在
构造方法中进行赋值，实现父类的run方法，调用Printer类中的输出字母的方法。
6)编写测试类Test，创建打印类对象，创建两个线程类对象，启动线程。*/
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