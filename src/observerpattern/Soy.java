package observerpattern;

/**
 * ���忧��װ���� Ħ��
 * 
 * @author AllenLee
 *
 */
public class Soy extends CondimentDecorator {

	protected Soy(Beverage cofffee) {
		super(cofffee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * �����ļƼ۷���
	 * ��һ�ݶ���4.5Ԫ
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 4.5f + coffeeBeverage.cost() ;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeBeverage.getDescription() + " +����(4.5 Ԫ�� ";
	}
	
}