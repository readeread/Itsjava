package com817.Exc1;

public class Mobile implements TakePhoto,Play,Dailup {

	@Override
	public void dailup() {
		System.out.println("di du ��Ҫ�绰��,mobile");
	}

	@Override
	public void play() {
		System.out.println("����Ҫplay my phone");		
	}

	@Override
	public void takePhoto() {
		System.out.println("this is a photo by mobile");		
	}

}
