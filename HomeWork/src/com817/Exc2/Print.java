/*Ȼ��дһ����Printʵ�ֽӿ�InterfaceA��InterfaceB��
Ҫ��
	printCapitalLetter()����ʵ�������дӢ����ĸ��Ĺ��ܣ�
	printLowercaseLetter()����ʵ�����СдӢ����ĸ��Ĺ��ܡ�*/
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
