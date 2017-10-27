/*��1��������һ��Java������Drink��Ӧ����
	a������һ�����󷽷�taste()���÷�������������ϵ�ζ����
	b������int�ͳ���������ͬ���������ͣ����ȡ�ơ�ơ�ţ�̣����磺
	c��������̬��������getDrink(int drinkType)�����ݴ���Ĳ���������ͬ�����϶��󣬲����ظö���
		����ʹ��switch��䡣û����Ӧ�����ϣ�Ҫ������Ӧ����ʾ��*/
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
