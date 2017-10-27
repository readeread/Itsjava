package com825.Test;

public class Triangle {
	private double side1;	
	private double side2;	
	private double side3;	
	
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public static void main(String[] args) {
		Triangle s=new Triangle(1, 1.5, 1);
		System.out.println(s.toString());
	}
	
	public double getPerimeter()
	{
		return side1+side2+side3;
	}

	public double getArea()
	{
		double s=getPerimeter()/2;
		s=s*(s-side1)*(s-side2)*(s-side3);
		return Math.pow(s, 0.5);
	}
	
	
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]\n"+
				"面积是："+getArea()+"\n周长是："+getPerimeter();
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	

}
