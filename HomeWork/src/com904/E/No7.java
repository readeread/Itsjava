package com904.E;
/*编写多线程程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，每
个人通过山洞的时间为5秒，有10个人同时准备过此山洞，显示每次通过山洞人的姓名
和顺序。*/
public class No7 {

	public static void main(String[] args) {
		Cave cave=new Cave();
		new PersonPass("zhang",cave).start();
		new PersonPass("san",cave).start();
		new PersonPass("feng",cave).start();
		new PersonPass("chou",cave).start();
		new PersonPass("ba",cave).start();
		new PersonPass("guai",cave).start();
	}

}

class PersonPass extends Thread{
	private String name;
	private Cave cave;

	public PersonPass(String name,Cave cave) {
		super(name);
		this.name = name;
		this.cave=cave;
	}
	
	@Override
	public void run() {
		
		cave.cross();
	}
	
}

class Cave{
	public synchronized void cross()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 过山洞");
	}
}