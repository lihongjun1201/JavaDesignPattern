package observerpattern;

/**
 * ����װ������
 * ͬ���̳��� Beverage��
 * 
 * @author AllenLee
 *
 */
public class CondimentDecorator extends Beverage {

	//���и������ϣ���װ�Σ���ʵ�ֶ�̬��
	Beverage coffeeBeverage;
	
	/**
	 * װ�������캯��
	 * ���뱻װ�����
	 * @param cofffee 
	 */
	protected CondimentDecorator(Beverage cofffee){
		this.coffeeBeverage = cofffee;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0.0f;
	}


}
