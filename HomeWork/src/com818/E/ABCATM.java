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
			default:System.out.println("请输入正确选项");
			}
		}
		outCard();
	}
	
	public void outCard()
	{
		System.out.println("欢迎下次光临");
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
			System.out.println("不是农业银行的卡不能充话费");
		}
	}
	
	public int allMenu()
	{
		System.out.println("请选择功能： ");
		card.DesFunction();
		
		int a=inp.nextInt();
		return a;
		
	}
}
