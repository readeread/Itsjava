/*(8)����һ������ Person, �����·�����
	<1> ʹ�ò����豸 use (�����豸)
	<2> ʹ�������豸 use(�����豸)
	<3> ʹ�ò����豸 use(�����豸)
	<4> ʹ�ò��Ų��������豸 use(���Ų��������豸)*/
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

