package com819.Exc1;

interface Doit{
	double doit(double a);
}

public class LambdaTest {

	public static void main(String[] args) {
		Handdle handdle=new Handdle();
		double numAdd=handdle.handdle(new Doit() {

			@Override
			public double doit(double a) {
				
				return a+2;
			}
			
		}, 5);
		
//		Handdle handdle1=new Handdle();
		double numMul=handdle.handdle((a)->a+2, 6);
		
		System.out.println("add: "+numAdd);
		System.out.println("add1: "+numMul);
	}

}

class Handdle{
	public  double handdle(Doit doit,double a)
	{
		return doit.doit(a);
	}
}

