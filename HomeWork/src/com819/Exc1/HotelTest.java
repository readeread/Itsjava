package com819.Exc1;

public class HotelTest {

	public static void main(String[] args) {
		Hotel hotel=new Hotel(4);
		
		hotel.addEmp(new Manager("li",12));
//		hotel.addEmp(new Chief("jack",12));
//		hotel.addEmp(new Waiter("rose",12));
		hotel.addEmp(new Waiter("wang",12));
		
		System.out.println(hotel.getLucky().getName());
		
		hotel.seeJob();
		hotel.seeVIP();
	}

}
