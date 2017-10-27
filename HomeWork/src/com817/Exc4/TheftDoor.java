package com817.Exc4;

public class TheftDoor extends Door implements Theftproof {

	@Override
	public void theftproof() {
		System.out.println("i can proof the theft");
	}

	@Override
	public void openDoor() {
		System.out.println("OPEN DOOR");
	}

	@Override
	public void closeDoor() {
		System.out.println("CLOSE DOOR");
	}
}
