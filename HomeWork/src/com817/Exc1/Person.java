/*(8)定义一个人类 Person, 有如下方法：
	<1> 使用拨号设备 use (拨号设备)
	<2> 使用拍照设备 use(拍照设备)
	<3> 使用播放设备 use(播放设备)
	<4> 使用拨号播放拍照设备 use(拨号播放拍照设备)*/
package com817.Exc1;

public class Person {
	
	public void use(Play play)
	{
		play.play();
	}
	
	public void use(Dailup dailup)
	{
		dailup.dailup();
	}
	
	public void use(TakePhoto takephoto)
	{
		takephoto.takePhoto();
	}
	
	public void use(Mobile mobile)
	{
		mobile.play();
		mobile.dailup();
		mobile.takePhoto();
	}
}

