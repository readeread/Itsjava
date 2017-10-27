package com904.E;
/*设计一个多线程的程序如下：设计一个火车售票模拟程序。假如火车站要有100张火车票
要卖出，现在有5个售票点同时售票，用5个线程模拟这5个售票点的售票情况*/
public class No5 {
	public static void main(String[] args) {
		Train sale=new Train(20);
		new Sale(sale,6,"zhang").start();
		new Sale(sale,6,"san").start();
		new Sale(sale,6,"feng").start();
		new Sale(sale,6,"wu").start();
		new Sale(sale,6,"ze").start();
		new Sale(sale,2,"tian").start();
	}
}

class Sale extends Thread{
	private Train train;
	private int num;
	
	public Sale(Train train, int num,String name) {
		super(name);
		this.train = train;
		this.num = num;
	}
	
	@Override
	public void run() {
		sale();
	}
	
	public synchronized void sale(){
		if(train.getTicket()<=0)
		{
			System.out.println("sale out");
			return;
		}
		if(train.getTicket()<num)
		{
			System.out.println("tickey not enough");
		}
		else 
		{
			System.out.println(Thread.currentThread().getName()+"买了"+num+"张票");
			int num=train.getTicket()-this.num;
			train.setTicket(num);
			System.out.println("剩下"+num+"张票");
		}
	}
	
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}

class Train {
	private int ticket;

	public Train(int ticket) {
		super();
		this.ticket = ticket;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
	
}