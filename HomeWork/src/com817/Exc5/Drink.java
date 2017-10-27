/*（1）、建立一个Java抽象类Drink，应当：
	a、声明一个抽象方法taste()，该方法负责输出饮料的味道；
	b、声明int型常量来代表不同的饮料类型（咖啡、啤酒、牛奶），如：
	c、声明静态工厂方法getDrink(int drinkType)，根据传入的参数创建不同的饮料对象，并返回该对象，
		建议使用switch语句。没有相应的饮料，要进行相应的提示。*/
package com817.Exc5;

public abstract class Drink {
	private final static int coffe=1; 
	private final static int bee=2; 
	private final static int milk=3; 
	
	public abstract void taste();
	
	public static Drink getDrink(int drinkType)
	{
		switch(drinkType)
		{
		case coffe:return new Coffe(); 
		case bee:return new Bee(); 
		case milk:return new Milk(); 
		default:System.out.println("none of it!!!!!!!!!!!!! ");
			return null;
		}
	}

	public int getCoffe() {
		return coffe;
	}

	public int getBee() {
		return bee;
	}

	public int getMilk() {
		return milk;
	}
	
	
}
