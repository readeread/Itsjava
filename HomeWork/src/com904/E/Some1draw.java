package com904.E;

import java.util.concurrent.locks.ReentrantLock;

public class Some1draw {
	public static void main(String[] args) {
		Account acc=new Account("zhang", 1000);
		
		AcTest at=new AcTest(acc, 700);
		AcTest at1=new AcTest(acc, 700);
		AcTest at2=new AcTest(acc, 100);
		
		Thread th3=new Thread(at2);
		Thread th2=new Thread(at1);
		
		Thread th1=new Thread(at);
		th1.start();	
		/*try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		th3.start();
		/*try {
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		th2.start();
	}
}

class AcTest implements Runnable{
	private Account acc;
	private double money;
	final static ReentrantLock lock=new ReentrantLock();
	
	public AcTest(Account acc, double money) {
		super();
		this.acc = acc;
		this.money = money;
	}

	public void get()
	{
		if(money<acc.getAccount())
		{
			System.out.println("ȡǮ�ɹ�");
			
			System.out.println("���Ϊ��"+(acc.getAccount()-money));
			acc.setAccount(acc.getAccount()-money);
		}
		else
		{
			System.out.println("����");
		}
	}
	
	@Override
	public void run() {
//		synchronized (acc) {
		lock.lock();
			get();
		lock.unlock();
//		}
		
		
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
}

class Account{
	private String name;
	private double account;
	public Account(String name, double account) {
		super();
		this.name = name;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(account);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(account) != Double.doubleToLongBits(other.account))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}