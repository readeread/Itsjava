package com817.Exc7;

public class Test {

	public static void main(String[] args) {
		Person li =new Person();
		
		
		Vehicle no=CarFactory.MakeCar("car");
		if(no!=null) li.goout(no);
		else System.out.println("11 load");
		
		Vehicle noo=CarFactory.MakeCar("bus");
		if(noo!=null) li.goout(noo);
		else System.out.println("11 load");
	}

}
