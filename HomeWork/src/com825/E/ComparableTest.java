package com825.E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*6、编写程序实现Comparable接口，步骤如下： 
（1）自定义类，实现Comparable接口，加上泛型；  
（2）定义测试类Test，创建两个对象o1和o2，并进行比较，输出比较结果*/

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