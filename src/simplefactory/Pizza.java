package simplefactory;

/**
 * pizza������
 * ���������ķ���
 * @author AllenLee
 *
 */
public abstract class Pizza {

	public void prepare() {
		System.out.println("\n׼��pizza...");
	}
	
	public void bake() {
		System.out.println("�決pizza...");
	}
	
	public void cut() {
		System.out.println("��Ƭpizza...");
	}
	
	public void box() {
		System.out.println("���pizza...\nPizza�����ˣ�");
	}
	
}

/**
 * ����pizza
 * @author AllenLee
 *
 */
class CheesePizza extends Pizza{
	public CheesePizza() {
		System.out.println("��������pizza");
	}
}

/**
 * ϣ��pizza
 * @author AllenLee
 *
 */
class GreekPizza extends Pizza{
	public GreekPizza() {
		System.out.println("����ϣ��pizza");
	}
}

/**
 * �������pizza
 * @author AllenLee
 *
 */
class PepperoniPizza extends Pizza{
	public PepperoniPizza() {
		System.out.println("�����������pizza");
	}
}

/**
 * ����pizz
 * @author AllenLee
 *
 */
class ClamPizza extends Pizza{
	public ClamPizza() {
		System.out.println("��������pizza");
	}
}


/**
 * �߲�pizza
 * @author AllenLee
 *
 */
class VeggiePizza extends Pizza{
	public VeggiePizza() {
		System.out.println("�����߲�pizza");
	}
}
