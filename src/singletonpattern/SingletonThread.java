package singletonpattern;


/**
 * 单例模式 （多线程场景）
 * 需要考虑同步
 * 
 * 单锁同步
 * 
 * 安卓中 InputMethodManager 中使用该模式
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
		//同步一次，锁定该类
		synchronized (SingletonThread.class) {
			if (null == instance) {
				instance = new SingletonThread();
			}
			
			return instance;
		}
	}
	
	
	
	
	
}
