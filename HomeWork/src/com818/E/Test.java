package com818.E;

public class Test {

	public static void main(String[] args) {
	/*	ABCBank kk=new ABCBank(123456,3000);		
//		 kk.getMoney();
		 
		 ICBCBank kj=new ICBCBank(123456,3000);		
		 kj.getMoney();*/
		
		ABCATM abc=new ABCATM(new ABCBank(123456,3000));
		abc.insertCard();
		
		/*ABCATM abc=new ABCATM(new CCBBank(123456,3000));
		abc.insertCard();*/
	}

}


