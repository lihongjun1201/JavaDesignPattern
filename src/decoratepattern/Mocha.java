package decoratepattern;

/**
 * ���忧��װ���� Ħ��
 * 
 * @author AllenLee
 *
 */
public class Mocha extends CondimentDecorator {

	protected Mocha(Beverage cofffee) {
		super(cofffee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Ħ���ļƼ۷���
	 * ��һ��Ħ��5.4Ԫ
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 5.4f + coffeeBeverage.cost();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeBeverage.getDescription() + " +Ħ��(5.4 Ԫ�� ";
	}
}
