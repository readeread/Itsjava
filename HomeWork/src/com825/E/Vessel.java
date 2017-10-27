package com825.E;

/*2、自定义一个泛型容器类
要求：（1）、添加数据的方法	boolean add(T t);
	(2)、获取指定下标位置处的元素 T get(int index);
	(3)、返回容器中的元素的个数		int size();
容器默认大小为10，当容器满的时候会自动扩充5个。*/
public class Vessel<T> {
	@SuppressWarnings("unchecked")
	T[] array = (T[]) new Object[10];// 初始化长度
	int num=0;

	public static void main(String[] args) {
		Vessel<Integer> vess=new Vessel<>();
		vess.add(1);
		vess.add(11);
		vess.add(12);
		vess.add(13);
		vess.add(14);
		vess.add(15);
		vess.add(16);
		vess.add(17);
		vess.add(18);
		vess.add(19);
		vess.add(20);
		
		System.out.println(vess.size()); 
		System.out.println(vess.get(14)); 
	}
	
	boolean add(T e)// 不能添加null
	{
		if (e == null)
			return false;
		if (array[array.length - 1] != null) {
			@SuppressWarnings("unchecked")
			T[] arr1 = (T[]) new Object[array.length + 5];

			int i = 0;
			for (T t : array) {
				arr1[i++] = t;
			}
			array = arr1;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = e;
				num++;
				break;
			}
		}
		return true;
	}

	T get(int a) {
		if(a>num)
		{
			System.out.println("沒有該元素");
			return null;
		}
		
		T e = null;
		e = array[a-1];			
		return e;
	}

	int size()
	{
		if(array==null)
			return 0;
		return num;
	}
}
