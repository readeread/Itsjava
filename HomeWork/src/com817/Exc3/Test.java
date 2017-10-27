package com817.Exc3;

public class Test {

	public static void main(String[] args) {
		Army ru=new Army(3);
		
		Weapon tank=new Tank();
		Weapon fri=new Flighter();
		Weapon ship=new WarShip();
		ru.addWeapon(tank);
		ru.addWeapon(fri);
		ru.addWeapon(ship);
		ru.addWeapon(ship);
		
		ru.moveAll();
		ru.attackAll();
	}

}
