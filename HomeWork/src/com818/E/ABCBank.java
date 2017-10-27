package com818.E;

import java.util.Scanner;

public class ABCBank implements ABC {

	private int password;
	private int balance;
	Scanner inp = new Scanner(System.in);

	public ABCBank() {
	}

	public ABCBank(int password, int balance) {
		this.password = password;
		this.balance = balance;
	}

	public boolean check() {//检测密码的正确性
		int i = 0;
		for (; i < 3; i++) {//三次输入机会
			System.out.println("输入密码");
			int a = inp.nextInt();
			if (a != this.password) {
				System.out.println("密码错误 请重新输入");
			} else {
				break;
			}			
		}
				
		if (i == 3)			
			{
				System.out.println("忘记密码，下次再来");
				return false;
			}
		else
			return true;
	}

	@Override
	public void getMoney() {
		if (check())// 输入密码
		{			
			System.out.println("输入金额：");
			int a = inp.nextInt();
			if (!BalanceMax(a)) {
				System.out.println("消费失败，余额不足");
			} else {
				this.balance -= a;
				System.out.println("取钱成功，余额为：" + this.balance);
			}
		} else {
			System.out.println("忘记密码， 下次再来");
		}
	}

	@Override
	public int checkBalance() {
		return this.balance;
	}

	@Override
	public void DesFunction() {

		System.out.println("1.查看余额    2.取款    3.充电话费");
	}

	@Override
	public void PayTelephone() {
		System.out.println("请输入电话号码：");
		inp.nextInt();
				
		System.out.println("请输入金额");
		int money=inp.nextInt();
//		inp.close();
		
		if(check())
		{
			if(BalanceMax(money))
			{
				this.balance-=money;
				System.out.println("消费成功，余额为：" + this.balance);
			}
			else
			{
				System.out.println("余额不足,缴费失败");
			}		
		}
		else
		{
			System.out.println("密码错误，缴费失败");
		}

	}
	
	@Override
	public boolean BalanceMax(int a) {
		int x=balance;
		x-=a;
		if (x < -2000) {
			return false;
		} 
		else 
		{
//			System.out.println("jiajdisajdiasji");
			return true;
		}
		
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	

}
