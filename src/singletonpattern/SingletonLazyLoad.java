package singletonpattern;


/**
 * �ӳټ���ģʽ
 * 
 * ������ʵ�����ӳٵ��õ���ʱ����ʵ����
 * 
 * �ŵ㣺��������ļ����ٶ�
 * 
 * @author AllenLee
 *
 */
public class SingletonLazyLoad {

	//������
	int data;
	
	//��̬����
	private static SingletonLazyLoad instance;
	
	/**
	 * ˽�еĹ��캯��
	 */
	private SingletonLazyLoad() {
		data = 617;
	}
	
	//��̬getInstance������ȡΨһ����ʵ��
	public static SingletonLazyLoad getInstance() {
		if (instance == null) {
			instance = new SingletonLazyLoad();
		}
		
		return instance;
	}

	//getter
	public int getData() {
		return data;
	}

	//setter
	public void setData(int data) {
		this.data = data;
	}
	
	
	//other member-methods...
	
	

}
