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
		
		New che=new New("汽车");
		New kao=new New("高考");
		New tec=new New("科技");
		New medi=new New("医学");
		
		title.list.add(che.title);
		title.list.add(kao.title);
		title.list.add(tec.title);
		title.list.add(medi.title);
		
		System.out.println("head:"+title.list.getFirst());
		title.show();
	}
	void  show()
	{
		System.out.println("新闻标题的数目为："+list.size()+"条");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+1+":"+list.get(i));
		}
		
	}
}
