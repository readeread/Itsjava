package com829.E;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*5��ʹ��HashMap������
����˵������������ʵ�ֵĲ��裬ʹ��HashMap��������Ӣ�ļ�ƺ�����ȫ����ļ�ֵӳ
�䣬��ͨ��key��value���в��������Ч������ͼ��ʾ��
���� J170701��ҵ �ĵ� 2 ҳ��1��ʹ��HashMap�洢�������Ӣ�ļ�ƺ�����ȫ�Ƶļ�ֵ�ԣ�
��2����ʾ"CN"��Ӧ���ҵ�����ȫ�ƣ�
��3����ʾ������Ԫ�ظ�����
��4�������ж�Map���Ƿ����"FR"����
��5���ֱ���ʾ������ֵ���ͼ�ֵ�Լ���
��6����� HashMap���жϣ�*/

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
