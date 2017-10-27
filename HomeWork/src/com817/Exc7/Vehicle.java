package com817.Exc7;

public interface Vehicle {
	void go();
}

class Bus implements Vehicle{

	@Override
	public void go() {
		System.out.println("bus go");
	}
	
}

class Car implements Vehicle{

	@Override
	public void go() {
		System.out.println("Car go");
	}
	
}

class Bike implements Vehicle{

	@Override
	public void go() {
		System.out.println("Bike go");
	}
	
}

class BabyCar implements Vehicle{

	@Override
	public void go() {
		System.out.println("Baby go");
	}
	
}
