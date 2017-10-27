package com904.E;
/*���һ�����̵߳ĳ������£����һ������Ʊģ����򡣼����վҪ��100�Ż�Ʊ
Ҫ������������5����Ʊ��ͬʱ��Ʊ����5���߳�ģ����5����Ʊ�����Ʊ���*/
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
			System.out.println(Thread.currentThread().getName()+"����"+num+"��Ʊ");
			int num=train.getTicket()-this.num;
			train.setTicket(num);
			System.out.println("ʣ��"+num+"��Ʊ");
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