package com904.E;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Some {

	public static void main(String[] args) {
		/*Myt m=new Myt("haha");
		m.start();
		
		Myt m1=new Myt("heihei");
		m1.start();*/
		
		
//		m1.run();
//		m1.start();
		
		//------------------------------------
		
		/*Myt1 myt1=new Myt1();
		
		Thread th2=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+": "+Thread.currentThread().getName());
			}
		});
		th2.start();
		
		Thread th=new Thread(myt1);
		th.start();
		
		Thread th1=new Thread(myt1);
		th1.start();*/
		
		//=-------------------------========
//		FutureTask<String> ft=new FutureTask(new Myt2());
		FutureTask<String> ft=new FutureTask<>(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+": "+Thread.currentThread().getName());
			}
			return "ftftftftf";
		});
		FutureTask<String> ft2=new FutureTask<>(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("dsssss"+i+": "+Thread.currentThread().getName());
				Thread.sleep(100);
			}
			return "sssss";
		});
		
		Thread th2=new Thread(ft);
		
		Thread th2_1=new Thread(ft2);
		th2.start();
		
		/*try {
			th2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		char a='a';
		for(int i=0;i<10;i++,a++)
		{
			System.out.println(a);
		}
		
		th2_1.start();
		
		try {
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


class Myt2 implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=0;i<10;i++)
		{
			System.out.println(i+": "+Thread.currentThread().getName());
		}
		return "���Ƿ���ֵ";
	}
	
}
class Myt1 implements Runnable{
	public Myt1()
		{
		}
	@Override
	public void run() {
		
		
		
			for(int i=0;i<10;i++)
			{
				System.out.println(i+": "+Thread.currentThread().getName());
			}
		
	}
	
}
class Myt extends Thread{
	
	public Myt(String n)
	{
		super(n);
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			System.out.println(i+": "+getName());
		}
	}
}

