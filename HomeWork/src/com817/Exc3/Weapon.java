/*��3������һ��������Weapon,ʵ��Assaultable�ӿں�Mobile�ӿڣ�����û�и��������
ʵ�ַ�����*/
package com817.Exc3;

public abstract class Weapon implements Mobile,Assaultable{
//	public abstract void attack();
//	public abstract void move();
	
}

class Tank extends Weapon{

	@Override
	public void move() {
		System.out.println("tank move slowly");
	}

	@Override
	public void attack() {
		System.out.println("strongly attack tank");
	}
	
}

class Flighter extends Weapon{

	@Override
	public void move() {
		System.out.println("Frighter move faster");
	}

	@Override
	public void attack() {
		System.out.println("strongly attack easy");		
	}	
}

class WarShip extends Weapon{

	@Override
	public void move() {
		System.out.println("tank move slowly,and need help");		
	}

	@Override
	public void attack() {
		System.out.println("best attack");		
	}
	
}
