
package com904.E;

public class No3 {
	/*假设一个银行的ATM机，它可以允许用户存款也可以取款。现在一个账户上有存款200
	元，用户A和用户B都拥有在这个账户上存款和取款的权利。用户A将存入100元，而用
	户B将取出50元，那么最后账户的存款应是250元。实际操作过程如下：
	3.
	1)得到账户的存款数额200，耗时2s。
	2)将账户数额增加100，耗时忽略不计
	3)将新生成的账户结果300返回到ATM机的服务器上，耗时2s
	(1) 先进行A的存款操作：
	4)得到增加后账户存款数额300，耗时2s。
	5)判断取款额是否小于账户余额，若是，则将账户数额减少50，否则抛出异常信
	息，耗时忽略不计。
	6)将新生成的账户结果250返回到ATM机的服务器上，耗时2s。
	(2) 再进行B的取款操作：
	请根据以上要求，将A的操作和B的操作分别用线程来表示,编写一个Java程序实现该功
	能。*/
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
			System.out.println(Thread.currentThread().getName()+"取钱成功，取钱金额为："+money);
			
			setAccount(account-=money);
			System.out.println("余额为："+getAccount());
		}
		else
		{
			System.out.println("余额不足，取钱失败");
		}
	}
	
	public synchronized void savaMoney(double money)
	{
		setAccount(account+=money);
		System.out.println("存入的金额为："+money+"\n余额为： "+getAccount());
	}
	
}