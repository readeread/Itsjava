package com901.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*创建购物车实体类，模拟购物车功能
需求：
1)添加商品到购物车（输入商品的编号和数量）
2)删除商品（删除购物车中的指定购物项）
3)修改商品（修改商品的数量）
4)显示所购买的商品信息（按购买商品的总价进行升序显示）*/
public class Test2 {

	public static void main(String[] args) {
		Cart cart=new Cart();
		
		cart.add(1, 2, 12);
		cart.add(1, 2, 12);//重复添加只加数量，单价只有第一次有效
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
	HashMap<Integer,Shops> hm=new HashMap<>();//编号对应商品对象
	HashMap<Integer,Double> hmPrice=new HashMap<>();//存商品和总价
	
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
			//同样的商品数量只加数量
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
			System.out.println("没有这个商品");
		}
	}
	
	public void delete(int a)
	{
		if(hm.remove(a)==null)
		{
			System.out.println("不存在这个商品");
		}
		hmPrice.remove(a);
	}
}