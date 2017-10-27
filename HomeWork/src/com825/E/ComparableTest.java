package com825.E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*6����д����ʵ��Comparable�ӿڣ��������£� 
��1���Զ����࣬ʵ��Comparable�ӿڣ����Ϸ��ͣ�  
��2�����������Test��������������o1��o2�������бȽϣ�����ȽϽ��*/

public class ComparableTest {

	public static void main(String[] args) {
		List<Show> show = new ArrayList<Show>();
		show.add(new Show("wang",77));
		show.add(new Show("li",71));
		show.add(new Show("jack",66));
		
		Collections.sort(show);
		System.out.println(show);
	}
	
	
}

class Show implements Comparable<Show>{
	String name;
	int age;
	
	
	public Show(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Show o) {
		if(o.age<this.age) return 1;
		return -1;
	}


	@Override
	public String toString() {
		return "Show [name=" + name + ", age=" + age + "]";
	}
}