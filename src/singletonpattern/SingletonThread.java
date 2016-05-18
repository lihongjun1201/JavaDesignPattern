package singletonpattern;


/**
 * ����ģʽ �����̳߳�����
 * ��Ҫ����ͬ��
 * 
 * ����ͬ��
 * 
 * ��׿�� InputMethodManager ��ʹ�ø�ģʽ
 * 
 * @author AllenLee
 *
 */
public class SingletonThread {
	
	int data;
	
	private static SingletonThread instance = null;
	
	private SingletonThread() {
		data = 617;
	}
	
	
	public static SingletonThread getInstance() {
		//ͬ��һ�Σ���������
		synchronized (SingletonThread.class) {
			if (null == instance) {
				instance = new SingletonThread();
			}
			
			return instance;
		}
	}
	
	
	
	
	
}
