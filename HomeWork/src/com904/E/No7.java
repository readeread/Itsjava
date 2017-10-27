package com904.E;
/*��д���̳߳���ģ������ͨ��һ��ɽ����ģ�⡣���ɽ��ÿ��ֻ��ͨ��һ���ˣ�ÿ
����ͨ��ɽ����ʱ��Ϊ5�룬��10����ͬʱ׼������ɽ������ʾÿ��ͨ��ɽ���˵�����
��˳��*/
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
		System.out.println(Thread.currentThread().getName()+" ��ɽ��");
	}
}