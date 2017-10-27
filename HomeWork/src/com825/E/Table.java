package com825.E;
/*3、实现一个管理Entry<K, V>类型元素的数组列表类Table<K, V>。
其中K为key的类型，V为value的类型
提供方法：
（1）、提供根据Key能找到关联的value
（2）、为key设置相应的value
（3）、修改key对应的value
（4）、删除key*/
public class Table<K,V>{
	Entry<K, V>[] en;
	public Table() {
		
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Table<Integer,String> ta=new Table<Integer,String>();
		ta.en=new Entry[5];
		ta.en[0]=new Entry<Integer,String>(1);
		ta.en[1]=new Entry<Integer,String>(2);
		ta.en[2]=new Entry<Integer,String>(3);
		ta.en[3]=new Entry<Integer,String>(4);
		ta.en[4]=new Entry<Integer,String>(5);
		
		String[] strs= {"a","b","c","d","e"};
		ta.setV(strs);
		ta.chenge(1, "haha");
		System.out.println(ta.findV(1));
		System.out.println(ta.findV(2));
	}
	
	public void delate(K k)
	{
		Entry<K, V>[] ent=new Entry[en.length-1];
		for(int i=0,j=0;i<en.length;i++)
		{
			if(en[i].getKey().equals(k))
			{
				continue;
			}
			ent[j]=en[i];
			j++;
		}
	}
	
	public void chenge(K k,V v)
	{
		for(int i=0;i<en.length;i++)
		{
			if(en[i].getKey().equals(k))
			{
				en[i].setValue(v);
				break;
			}
		}
	}
	
	public void setV(V[] v)
	{
		for(int i=0;i<en.length;i++)
		{
			en[i].setValue(v[i]);
		}
	}
	
	public V findV(K k)
	{
		for(int i=0;i<en.length;i++)
		{
			if(en[i].getKey().equals(k))
			{
				return en[i].getValue();
				
			}
		}
		
		System.out.println("沒有對應的KEY");
		return null;
	}
}

class Entry<K, V>{
	private final K key;
	private V value;
	
	public Entry(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}
}
