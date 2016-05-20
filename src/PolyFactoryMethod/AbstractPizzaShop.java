package PolyFactoryMethod;


/**
 * �����������ģʽ
 * 
 * ͨ��������������ṩһ������ġ�����������
 * �ڸù������������ö�̬�ԣ��ò�ͬ�����๤���������ֶ����Ĳ�Ʒ��
 * 
 * �ؼ����ǣ�   [abstract] product p = [abstract] factoryMethodcreateProduct��Type)
 * 
 * ����Ļ���
 * 
 * ��ͬ�����ļ��˵�̳иó���pizza��
 * @author AllenLee
 *
 */
public abstract class AbstractPizzaShop {
	
	/**
	 * ����Ĵ���pizza����
	 * ������ͬ���������pizzashop override�ó��󷽷���������̬��
	 * 
	 * @param Type
	 * @return
	 */
	protected abstract AbstractPizza createPizza(String Type);
	
	
	
	/**
	 * ����pizza��������
	 * 
	 * �����˾��ж�̬�Եĳ����creatPizza����
	 * �������ɵ���ʲô��ζ��pizza ���ɲ�ͬ������pizza�������
	 * 
	 * @param Type
	 * @return
	 */
	public final AbstractPizza orderPizza(String Type){
		AbstractPizza pizza = createPizza(Type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
