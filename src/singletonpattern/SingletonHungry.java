package singletonpattern;



/**
 * ����ģʽ
 * ����������ص�����ʱ ���̴�������
 * 
 * ȱ�㣺 �������������Ӵ������ĳ�ʼ��ʱ���ϳ�
 * @author AllenLee
 *
 */
public class SingletonHungry {

	int data;
	private static SingletonHungry instance = new SingletonHungry();
	
	private SingletonHungry() {
		data = 617;
	}
	
	public static SingletonHungry getInstance() {
		return instance;
	}
	
}
