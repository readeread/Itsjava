/*再写一个主类Test，在主类Test的main方法中创建Print的对象并赋值给InterfaceA的变量a，
对象a调用printCapitalLetter方法；
最后再在主类E的main方法中创建Print的对象并赋值给InterfaceB的变量b，对象b调用printLowercaseLetter方法。*/
package com817.Exc2;

public class Test {

	public static void main(String[] args) {
		InterfaceA a=new Print();
		 a.printCapitalLetter();
		 
		InterfaceB b=new Print();
		b.printLowercaseLetter();
	}

}
