package observerpattern;

public abstract class Beverage {

	String description;
	
	public Beverage() {
		description = "�ǰͿ˿���";
	}
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * ����ļƼ۷���
	 * �ɲ�ͬ����ʵ��
	 * @return
	 */
	public abstract float cost(); 
	
}
