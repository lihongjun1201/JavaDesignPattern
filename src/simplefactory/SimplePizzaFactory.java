package simplefactory;


/**
 * �򵥹���ģʽ
 * 
 * ���Զ��壨��̬�������������ڸ÷����� new ��ͬ�ľ����Ʒ����
 * �û����Բ���ֱ�Ӳ���new������������Ҫ�Ķ������ͼ��ɣ����ع��ľ��幹�캯����
 * 
 * �ŵ㣺��ֱ�����߼�������new������дҵ���߼�Ҫ�á�
 * 
 * ȱ�㣺
 * 1.��һ�������Ӹ��־����Ʒ����ʵ���Ĵ���������Թ���
 * 2.����²�Ʒʱ����Ȼ��Ҫ���Ĺ��������е��߼����롣
 * 
 * @author AllenLee
 *
 */
public class SimplePizzaFactory {
	
	/**
	 * ����pizza�����ɶ���
	 * 
	 * �þ�̬�������������Է������
	 * 
	 * @param comsumerType
	 * @return ׼����ݸ��ͻ��ľ���pizza
	 */
	public /*static*/ Pizza createPizza(String comsumerType) {

		Pizza pizza = null;
		
		switch (comsumerType) {	
		case "Cheese":
			pizza = new CheesePizza();
			break;
		case "Greek":
			pizza = new GreekPizza();
			break;
		case "Pepperoni":
			pizza = new PepperoniPizza();
			break;
			
			//���²�Ʒ��ʱ��Ҫ���Ĵ˴�
		}

		return pizza;
	}

	
	
}
