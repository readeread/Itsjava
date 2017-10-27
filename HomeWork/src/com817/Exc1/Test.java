/*(9)编写测试类Test
	分别创建人，电话，Dvd，照相机，手机对象，让人使用这些对象。*/
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
		li.use(ku);//三种功能的
		
	}

}
