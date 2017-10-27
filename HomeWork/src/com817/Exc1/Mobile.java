package com817.Exc1;

public class Mobile implements TakePhoto,Play,Dailup {

	@Override
	public void dailup() {
		System.out.println("di du 我要电话了,mobile");
	}

	@Override
	public void play() {
		System.out.println("我想要play my phone");		
	}

	@Override
	public void takePhoto() {
		System.out.println("this is a photo by mobile");		
	}

}
