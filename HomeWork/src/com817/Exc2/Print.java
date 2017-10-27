/*然后写一个类Print实现接口InterfaceA和InterfaceB。
要求：
	printCapitalLetter()方法实现输出大写英文字母表的功能，
	printLowercaseLetter()方法实现输出小写英文字母表的功能。*/
package com817.Exc2;

public class Print implements InterfaceA,InterfaceB {

	@Override
	public void printLowercaseLetter() {
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}

	@Override
	public void printCapitalLetter() {
		System.out.println("abcdefghijklmnopqrstuvwxyz");
	}
	
}
