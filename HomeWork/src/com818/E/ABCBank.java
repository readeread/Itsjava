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

	public boolean check() {//����������ȷ��
		int i = 0;
		for (; i < 3; i++) {//�����������
			System.out.println("��������");
			int a = inp.nextInt();
			if (a != this.password) {
				System.out.println("������� ����������");
			} else {
				break;
			}			
		}
				
		if (i == 3)			
			{
				System.out.println("�������룬�´�����");
				return false;
			}
		else
			return true;
	}

	@Override
	public void getMoney() {
		if (check())// ��������
		{			
			System.out.println("�����");
			int a = inp.nextInt();
			if (!BalanceMax(a)) {
				System.out.println("����ʧ�ܣ�����");
			} else {
				this.balance -= a;
				System.out.println("ȡǮ�ɹ������Ϊ��" + this.balance);
			}
		} else {
			System.out.println("�������룬 �´�����");
		}
	}

	@Override
	public int checkBalance() {
		return this.balance;
	}

	@Override
	public void DesFunction() {

		System.out.println("1.�鿴���    2.ȡ��    3.��绰��");
	}

	@Override
	public void PayTelephone() {
		System.out.println("������绰���룺");
		inp.nextInt();
				
		System.out.println("��������");
		int money=inp.nextInt();
//		inp.close();
		
		if(check())
		{
			if(BalanceMax(money))
			{
				this.balance-=money;
				System.out.println("���ѳɹ������Ϊ��" + this.balance);
			}
			else
			{
				System.out.println("����,�ɷ�ʧ��");
			}		
		}
		else
		{
			System.out.println("������󣬽ɷ�ʧ��");
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
