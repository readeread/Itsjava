package com828.E;

import java.util.ArrayList;
import java.util.List;

class New {
	int id;
	String title;
	String name;
	
	public New(String title) {
		this.title = title;
	}
}

public class Title{
	List<String> list=new ArrayList<>();
	
	public static void main(String[] args) {
		Title title=new Title();
		
		New che=new New("����");
		New kao=new New("�߿�");
		New tec=new New("�Ƽ�");
		
		title.list.add(che.title);
		title.list.add(kao.title);
		title.list.add(tec.title);
		
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