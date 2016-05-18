package singletonpattern;

public class SingletonDoubleCheck {
	
	int data;
	private static SingletonDoubleCheck instance = new SingletonDoubleCheck();
	
	private SingletonDoubleCheck() {
		data = 617;
	}
	
	public static SingletonDoubleCheck getInstance() {
		//check one
		//如果非null，则不必每次都加锁，直接返回单例对象即可。
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
