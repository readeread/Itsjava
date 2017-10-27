package com825.Test;

interface FuncChange{
	void  funcChange();
}

public abstract class Conditioning {
	private String direction;
	private String strong;
	private double cold;
	private double power;
	
	
	/*public Conditioning() {
	}*/
	public Conditioning(String direction, String strong, double cold, double power) {
		this.direction = direction;
		this.strong = strong;
		this.cold = cold;
		this.power = power;
	}
	public void turnOn()
	{
		System.out.println("开启");
		turnWind("da");
		turnDirec("updoen");
		if(this instanceof FuncChange)
		{
			((FuncChange)this).funcChange();
		}
		turnoff();
	}
	public void turnoff()
	{
		System.out.println("关闭");
	}
	
	public abstract void turnWind(String a);
	public abstract void turnDirec(String a);

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getStrong() {
		return strong;
	}

	public void setStrong(String strong) {
		this.strong = strong;
	}

	public double getCold() {
		return cold;
	}

	public void setCold(double cold) {
		this.cold = cold;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
}

class Gree extends Conditioning implements FuncChange{

	public Gree(String direction, String strong, double cold, double power) {
		super(direction, strong, cold, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void funcChange() {
		System.out.println("格力空调会变频，一晚只要一度电");
	}

	@Override
	public void turnWind(String a) {
		setStrong(a);
	}

	@Override
	public void turnDirec(String a) {
		setDirection(a);
	}
	
}

class Hair extends Conditioning{

	public Hair(String direction, String strong, double cold, double power) {
		super(direction, strong, cold, power);
	}

	@Override
	public void turnWind(String a) {
		setStrong(a);
	}

	@Override
	public void turnDirec(String a) {
		setDirection(a);
	}
	
}
