package decoratepattern;

/**
 * ���忧��װ���� ����
 * 
 * @author AllenLee
 *
 */
public class Whip extends CondimentDecorator {

	protected Whip(Beverage cofffee) {
		super(cofffee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ���ݵļƼ۷���
	 * ��һ������8.2Ԫ
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 8.2f + coffeeBeverage.cost();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeBeverage.getDescription() + " +���ݣ�8.2�� ";
	}
	
}