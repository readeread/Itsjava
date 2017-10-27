package com818.E;

public interface UnionPay {
	boolean check();
	void getMoney();
	int checkBalance();
	void DesFunction();
}

interface ICBC extends UnionPay{	
	void PayOnline();
	
}

interface ABC extends UnionPay{
	void PayTelephone();
	boolean BalanceMax(int a);
}

interface CCB extends UnionPay{
	void payGas();
}
