/*��2��������Drink�ľ������ࣺ
	a���ֱ���Drink�����ࣺCoffee�������ȣ���Beer������ơ�ƣ���Milk������ţ�̣�;
	b��ʵ��taste()������Ҫ���ڿ���̨��ӡ���Ե�ζ��������*/
package com817.Exc5;

public class Coffe extends Drink{

	@Override
	public void taste() {
		System.out.println(" taste bitter");
	}

}

 class Bee extends Drink{

	@Override
	public void taste() {
		System.out.println(" taste exciting");		
	}
	 
 }
 
 class Milk extends Drink{

	@Override
	public void taste() {
		System.out.println(" taste sleep");		
	}
	 
 }