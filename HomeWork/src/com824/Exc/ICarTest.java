package com824.Exc;
/*2������һ���ӿ�ICar�������Զ��塣
��дһ�������࣬дһ�����������Խ���ICar��������Ϊ�������͵�һ�������ࡣ*/
interface ICar {
	void show();
}

public class ICarTest<E>{
	
	public static void main(String[] args) {
		ICarTest<ICar> t=new ICarTest<>();
		
		/*t.In(new ICar() {

			@Override
			public void show() {
				System.out.println("�����ҵĳ�");
			}
			
		});*/
		t.In(()->System.out.println("�����ҵĳ�"));
	}

	public void In(E e)
	{
		((ICar) e).show();
	}
}