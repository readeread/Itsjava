package com828.E;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*class New {
	int id;
	String title;
	String name;
	
	public New(String title) {
		this.title = title;
	}
}*/

public class Title2{
	LinkedList<String> list=new LinkedList<>();
	
	public static void main(String[] args) {
		Title2 title=new Title2();
		
		New che=new New("����");
		New kao=new New("�߿�");
		New tec=new New("�Ƽ�");
		New medi=new New("ҽѧ");
		
		title.list.add(che.title);
		title.list.add(kao.title);
		title.list.add(tec.title);
		title.list.add(medi.title);
		
		System.out.println("head:"+title.list.getFirst());
		title.show();
	}
	void  show()
	{
		System.out.println("���ű������ĿΪ��"+list.size()+"��");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+1+":"+list.get(i));
		}
		
	}
}
