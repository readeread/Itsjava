/*4�����һ�ų������Door����ô������������˵����Ӧ��ӵ�������ŵĹ��ԣ�����openDoor()�͹���closeDoor()��
Ȼ����Ž�������Ĺ������,����--theftproof()����ˮ--waterproof()������--bulletproof()�����𡢷��⡭��
Ҫ�����ü̳С������ࡢ�ӿڵ�֪ʶ��Ƹ���*/
package com817.Exc4;

public abstract class Door {
	
	
	public abstract void openDoor();
	public abstract void closeDoor();
}

interface Theftproof
{
	void theftproof();
}

interface Waterproof
{
	void waterproof();
}

