
/*（3）、建立Test测试类，测试以上内容的正确性
	a、编写main方法，通过命令行传参的方式传入某种饮料的类型。
	b、在main方法中，调用Drink类的getDrink方法，获得相应的饮料对象。
	c、然后调用该饮料对象的taste()方法，输出该饮料的味道。*/
	
package com817.Exc5;

public class Test {

	public static void main(String[] args) {
		
		
		Drink a=Drink.getDrink(Integer.parseInt(args[0]));
		if(a!=null)
		a.taste();
		
		Drink b=Drink.getDrink(1);
		if(b!=null)
		b.taste();
		
		Drink c=Drink.getDrink(6);
		if(c!=null) c.taste();
	}

}
