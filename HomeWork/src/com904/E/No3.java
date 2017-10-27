
package com904.E;

public class No3 {
	/*����һ�����е�ATM���������������û����Ҳ����ȡ�����һ���˻����д��200
	Ԫ���û�A���û�B��ӵ��������˻��ϴ���ȡ���Ȩ�����û�A������100Ԫ������
	��B��ȡ��50Ԫ����ô����˻��Ĵ��Ӧ��250Ԫ��ʵ�ʲ����������£�
	3.
	1)�õ��˻��Ĵ������200����ʱ2s��
	2)���˻���������100����ʱ���Բ���
	3)�������ɵ��˻����300���ص�ATM���ķ������ϣ���ʱ2s
	(1) �Ƚ���A�Ĵ�������
	4)�õ����Ӻ��˻��������300����ʱ2s��
	5)�ж�ȡ����Ƿ�С���˻������ǣ����˻��������50�������׳��쳣��
	Ϣ����ʱ���Բ��ơ�
	6)�������ɵ��˻����250���ص�ATM���ķ������ϣ���ʱ2s��
	(2) �ٽ���B��ȡ�������
	���������Ҫ�󣬽�A�Ĳ�����B�Ĳ����ֱ����߳�����ʾ,��дһ��Java����ʵ�ָù�
	�ܡ�*/
	public static void main(String[] args) {
		Accounts acc=new Accounts("card", 100);
		new Thread(new ATM(acc,200,50),"zhang").start();
		new Thread(new ATM(acc,200,650),"jack").start();
	}

}

class ATM implements Runnable{
	private Accounts acc;
	private double amount;
	private double amountget;
	
	public ATM(Accounts acc, double amount, double amountget) {
		this.acc = acc;
		this.amount = amount;
		this.amountget = amountget;
	}

	@Override
	public void run() {
		/*synchronized (acc) {
			
		}*/
		System.out.println("ssssssssssss"+acc.getAccount());
		acc.savaMoney(amount);
		acc.getmoney(amountget);
	}
	
	public Accounts
	getAcc() {
		return acc;
	}
	public void setAcc(Accounts acc) {
		this.acc = acc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmountget() {
		return amountget;
	}

	public void setAmountget(double amountget) {
		this.amountget = amountget;
	}
	
}

class Accounts {
	private String type;
	private double account;
	
	public Accounts(String type, double account) {
		this.type = type;
		this.account = account;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public synchronized double getAccount() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}
	public synchronized void setAccount(double account) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.account = account;
	}
	
	public synchronized void getmoney(double money)
	{
		if(money<=account)
		{
			System.out.println(Thread.currentThread().getName()+"ȡǮ�ɹ���ȡǮ���Ϊ��"+money);
			
			setAccount(account-=money);
			System.out.println("���Ϊ��"+getAccount());
		}
		else
		{
			System.out.println("���㣬ȡǮʧ��");
		}
	}
	
	public synchronized void savaMoney(double money)
	{
		setAccount(account+=money);
		System.out.println("����Ľ��Ϊ��"+money+"\n���Ϊ�� "+getAccount());
	}
	
}