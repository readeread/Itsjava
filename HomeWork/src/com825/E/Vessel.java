package com825.E;

/*2���Զ���һ������������
Ҫ�󣺣�1����������ݵķ���	boolean add(T t);
	(2)����ȡָ���±�λ�ô���Ԫ�� T get(int index);
	(3)�����������е�Ԫ�صĸ���		int size();
����Ĭ�ϴ�СΪ10������������ʱ����Զ�����5����*/
public class Vessel<T> {
	@SuppressWarnings("unchecked")
	T[] array = (T[]) new Object[10];// ��ʼ������
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
	
	boolean add(T e)// �������null
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
			System.out.println("�]��ԓԪ��");
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
