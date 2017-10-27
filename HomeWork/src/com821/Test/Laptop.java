package com821.Test;

public class Laptop {
	Mouse mouse;
	Keyboard key;
	
	
	
	public Laptop(Mouse mouse, Keyboard key) {
		this.mouse = mouse;
		this.key = key;
	}

	
	public static void main(String[] args) {
		Laptop laptop=new Laptop(new Mouse(),new Keyboard());
		laptop.run();
	}
	
	public void run()//����ʹ��USB�豸�Ĺ���
	{
		System.out.println("start");
		useUSB(mouse);
		useUSB(key);
		shutdown();
	}
	
	public void shutdown()
	{
		System.out.println("shutdown");
	}
	
	public void useUSB(USB usb)//ʹ��USB�豸
	{
		usb.open();
		usb.close();
	}
}
