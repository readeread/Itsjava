package com904.E;
/*4. ���ö��߳����ĳ��Χ����,ÿ���̸߳��� 1000��Χ���߳�1��1-1000��
�߳� 2 �� 1001-2000��
�߳� 3 �� 2001-3000��
��̳���ÿ���߳��ҵ���������ʱ��ӡ*/
public class No4 extends Thread {
	static int y=0;
	Integer x=1;
	int s;
	
	public No4(int s) {
		this.s = s;
	}

	public static void main(String[] args) {
		new No4(0).start();
		System.out.println("adddddddddddddddddddddddddddddds"+Thread.activeCount());
		new No4(1000).start();
		new No4(2000).start();
		
		/*if(Thread.activeCount()==1)
			System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		System.out.println("����������"+y);*/
	}

	@Override
	public void run() {
		/*synchronized(x)*/ {

			for(int i=1+s;i<=1000+s;i++)
			{
				int j=0;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						break;
					}
				}
				if(i==j)
					{
					y++;
					System.out.println(i);
					}
			}
		}
				
	}
	
	
}