/*(9)��д������Test
	�ֱ𴴽��ˣ��绰��Dvd����������ֻ���������ʹ����Щ����*/
package com817.Exc1;

public class Test {

	public static void main(String[] args) {
		Person li =new Person();
		Mobile ku =new Mobile();
		Telephone dian=new Telephone();
		Dvd dvd=new Dvd();
		Camera camera=new Camera();
		
		li.use(dian);
		li.use(dvd);
		li.use(camera);
		li.use(ku);//���ֹ��ܵ�
		
	}

}
