package factorymethodpattern;

import simplefactory.Pizza;


/**
 * ����Ĳ�Ʒ����
 * 
 * ������������಻ͬ�ľ����Ʒ��
 * @author AllenLee
 *
 */
public abstract class AbstractPizza {

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


//���岻ͬ��ζ��pizza����
//ŦԼ��ζpizza������pizza��Ʒ
//-------------------------------------------------------------------------------
/**
 * ����pizza
 * @author AllenLee
 *
 */
class NYCheesePizza extends AbstractPizza{
	public NYCheesePizza() {
		System.out.println("����ŦԼ��ζ����pizza");
	}
}

/**
 * ϣ��pizza
 * @author AllenLee
 *
 */
class NYGreekPizza extends AbstractPizza{
	public NYGreekPizza() {
		System.out.println("����ŦԼ��ζϣ��pizza");
	}
}

/**
 * �������pizza
 * @author AllenLee
 *
 */
class NYPepperoniPizza extends AbstractPizza{
	public NYPepperoniPizza() {
		System.out.println("����ŦԼ��ζ�������pizza");
	}
}

/**
 * ����pizz
 * @author AllenLee
 *
 */
class NYClamPizza extends AbstractPizza{
	public NYClamPizza() {
		System.out.println("����ŦԼ��ζ����pizza");
	}
}


/**
 * �߲�pizza
 * @author AllenLee
 *
 */
class NYVeggiePizza extends AbstractPizza{
	public NYVeggiePizza() {
		System.out.println("����ŦԼ��ζ�߲�pizza");
	}
}



//��ɼ�pizza������pizza��Ʒ
//-----------------------------
/**
 * ����pizza
 * @author AllenLee
 *
 */
class LACheesePizza extends AbstractPizza{
	public LACheesePizza() {
		System.out.println("������ɼ��ζ����pizza");
	}
}

/**
 * ϣ��pizza
 * @author AllenLee
 *
 */
class LAGreekPizza extends AbstractPizza{
	public LAGreekPizza() {
		System.out.println("������ɼ��ζϣ��pizza");
	}
}

/**
 * �������pizza
 * @author AllenLee
 *
 */
class LAPepperoniPizza extends AbstractPizza{
	public LAPepperoniPizza() {
		System.out.println("������ɼ��ζ�������pizza");
	}
}

/**
 * ����pizz
 * @author AllenLee
 *
 */
class LAClamPizza extends AbstractPizza{
	public LAClamPizza() {
		System.out.println("������ɼ��ζ����pizza");
	}
}


/**
 * �߲�pizza
 * @author AllenLee
 *
 */
class LAVeggiePizza extends AbstractPizza{
	public LAVeggiePizza() {
		System.out.println("������ɼ��ζ�߲�pizza");
	}
}

