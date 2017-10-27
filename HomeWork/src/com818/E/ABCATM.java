package com818.E;

import java.util.Scanner;

public class ABCATM {
	private UnionPay card;
	Scanner inp=new Scanner(System.in);
	
	public ABCATM(UnionPay card){
		this.card=card;
	}
	
	public void insertCard()
	{
		
		if(card.check())
		{
			switch(allMenu()) {
			case 1:showBalance();break;
			case 2:takeMoney();break;
			case 3:payTelBill();break;
			default:System.out.println("��������ȷѡ��");
			}
		}
		outCard();
	}
	
	public void outCard()
	{
		System.out.println("��ӭ�´ι���");
	}
	
	public void showBalance()
	{
		System.out.println(card.checkBalance());
	}
	
	public void takeMoney()
	{
		card.getMoney();
	}
	
	public void payTelBill()
	{
		if(card instanceof ABCBank)
		{
			((ABC)card).PayTelephone();
		}
		else
		{
			System.out.println("����ũҵ���еĿ����ܳ仰��");
		}
	}
	
	public int allMenu()
	{
		System.out.println("��ѡ���ܣ� ");
		card.DesFunction();
		
		int a=inp.nextInt();
		return a;
		
	}
}
