package com824.Exc;
/*2、设置一个接口ICar，方法自定义。
编写一个工具类，写一个方法，可以接受ICar的子类作为泛型类型的一个泛型类。*/
interface ICar {
	void show();
}

public class ICarTest<E>{
	
	public static void main(String[] args) {
		ICarTest<ICar> t=new ICarTest<>();
		
		/*t.In(new ICar() {

			@Override
			public void show() {
				System.out.println("这是我的车");
			}
			
		});*/
		t.In(()->System.out.println("这是我的车"));
	}

	public void In(E e)
	{
		((ICar) e).show();
	}
}