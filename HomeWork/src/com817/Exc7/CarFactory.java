package com817.Exc7;

public class CarFactory {
	public static Vehicle MakeCar(String str)
	{
		if(str.equals("bus"))
		{
			return new Bus();
		}
		else if(str.equals("bike"))
		{
			return new Bike();
		}
		else if(str.equals("car"))
		{
			return new Car();
		}
		else if(str.equals("babyCar"))
		{
			return new BabyCar();
		}
		else
			return null;
	}
}
