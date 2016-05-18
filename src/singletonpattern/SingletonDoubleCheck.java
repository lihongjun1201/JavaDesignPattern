package singletonpattern;

public class SingletonDoubleCheck {
	
	int data;
	private static SingletonDoubleCheck instance = new SingletonDoubleCheck();
	
	private SingletonDoubleCheck() {
		data = 617;
	}
	
	public static SingletonDoubleCheck getInstance() {
		//check one
		//�����null���򲻱�ÿ�ζ�������ֱ�ӷ��ص������󼴿ɡ�
		if (null == instance) {
			synchronized (SingletonDoubleCheck.class) {
				//check two
				if(null == instance){
					instance = new SingletonDoubleCheck();
				}
			}
		}
		
		return instance;
		
	}
	
}
