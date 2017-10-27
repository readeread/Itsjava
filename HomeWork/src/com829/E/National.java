package com829.E;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*5、使用HashMap集合类
需求说明：按照以下实现的步骤，使用HashMap建立国家英文简称和中文全名间的键值映
射，并通过key对value进行操作，输出效果如下图所示：
分区 J170701作业 的第 2 页（1）使用HashMap存储多组国家英文简称和中文全称的键值对；
（2）显示"CN"对应国家的中文全称；
（3）显示集合中元素个数；
（4）两次判断Map中是否存在"FR"键；
（5）分别显示键集、值集和键值对集；
（6）清空 HashMap并判断；*/

public class National {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<>();
		map.put("CN", "zhongguo");
		map.put("JP", "Jpam");
		map.put("EN", "yingguo");
		
		Set<String> set=map.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext())
		{
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println("num:"+map.size());
		
		System.out.println(map.containsKey("Cs"));
		
		map.clear();
	}
}
