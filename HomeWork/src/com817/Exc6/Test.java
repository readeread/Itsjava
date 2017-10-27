package com817.Exc6;

public class Test {

	public static void main(String[] args) {
		Manager li=new Manager("li", 55, "female", 123456);
		Employee wang =new Employee("wang", 38, "male", 12345);
		
		li.play();
		li.sing();
		System.out.println(li.getVehicle());
		
		wang.play();
		wang.sing();
	}

}
