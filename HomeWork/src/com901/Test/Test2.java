package com901.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*�������ﳵʵ���࣬ģ�⹺�ﳵ����
����
1)�����Ʒ�����ﳵ��������Ʒ�ı�ź�������
2)ɾ����Ʒ��ɾ�����ﳵ�е�ָ�������
3)�޸���Ʒ���޸���Ʒ��������
4)��ʾ���������Ʒ��Ϣ����������Ʒ���ܼ۽���������ʾ��*/
public class Test2 {

	public static void main(String[] args) {
		Cart cart=new Cart();
		
		cart.add(1, 2, 12);
		cart.add(1, 2, 12);//�ظ����ֻ������������ֻ�е�һ����Ч
		cart.add(1, 2, 12);
		cart.add(1, 2, 12);
		cart.add(1, 2, 12);
		cart.add(1, 2, 12);
		cart.add(3, 2, 12);
		cart.add(3, 2, 12);
		cart.add(3, 2, 12);
		cart.add(6, 2, 12);
		cart.add(3, 2, 12);
		cart.add(3, 2, 12);
		cart.add(3, 2, 12);
		cart.add(3, 2, 12);
		cart.add(3, 2, 12);
		
		cart.show();
		
		System.out.println("--------------");
		cart.delete(1);
		cart.show();
	}

}

class Cart{
	HashMap<Integer,Shops> hm=new HashMap<>();//��Ŷ�Ӧ��Ʒ����
	HashMap<Integer,Double> hmPrice=new HashMap<>();//����Ʒ���ܼ�
	
	ArrayList<Shops> al=new ArrayList<>();
	
	{
		al.add(new Shops(1,2,1.2));
		al.add(new Shops(2,2,1.2));
		al.add(new Shops(3,2,2));
		al.add(new Shops(4,2,2.0));
	}
	
	public void show()
	{
		
//		Collections.sort
		Iterator<Map.Entry<Integer,Double>> iter=hmPrice.entrySet().iterator();
		HashMap<Double,Integer> hmP=new HashMap<>();
		List<Double> li=new ArrayList<>();
		

		while(iter.hasNext())
		{
			
			Map.Entry<Integer,Double> me=iter.next();
			
			hmP.put(me.getValue(),me.getKey());
			li.add(me.getValue())	;
		}
		
		
		Collections.sort(li);
		
		
		
		Iterator<Double> iters=li.iterator();
		
		while(iters.hasNext())
		{
			
			Double me=iters.next();
			
			System.out.println(hmP.get(me)+"("+me+")");	
		}
		
		
	}
	
	public void add(int a,int b,double c)
	{
		Shops s=null;
		if((s=hm.put(a,new Shops(a, b, c))) != null)
		{
			//ͬ������Ʒ����ֻ������
			hm.put(a, new Shops(a, s.getNum()+b, c));
			
			hmPrice.put(a, (s.getNum()+b)*c);
		}else
		{
			hmPrice.put(a, b*c);
		}
		
	}
	
	public void change(int a,int b)
	{		
		if(hm.containsKey(a))
		{
			Shops s1=hm.get(a);
			hm.put(a,new Shops(a, b, s1.getPrice()));
		}
		else
		{
			System.out.println("û�������Ʒ");
		}
	}
	
	public void delete(int a)
	{
		if(hm.remove(a)==null)
		{
			System.out.println("�����������Ʒ");
		}
		hmPrice.remove(a);
	}
}