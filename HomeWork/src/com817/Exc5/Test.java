
/*��3��������Test�����࣬�����������ݵ���ȷ��
	a����дmain������ͨ�������д��εķ�ʽ����ĳ�����ϵ����͡�
	b����main�����У�����Drink���getDrink�����������Ӧ�����϶���
	c��Ȼ����ø����϶����taste()��������������ϵ�ζ����*/
	
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
