package decoratepattern;

public class AllenCafeTest {

	public static void main(String[] args) {
		
		//��Ⱥ決���� +��Ħ�� + ���� 
		Beverage customCoffee1 = new Mocha(new Whip(new DarkRoastCoffee()));
		System.out.println("�˿�1 ��Ŀ��� �� " + customCoffee1.getDescription());
		System.out.println("�˿͵�Ŀ��ȼ۸� �� " + customCoffee1.cost() + "\n");
	
		//Ũ������ + ˫��Ħ�� + ����
		Beverage customCoffee2 = new Mocha(new Mocha(new Soy(new EspressoCoffee())));
		System.out.println("�˿�2 ��Ŀ��� �� " + customCoffee2.getDescription());
		System.out.println("�˿͵�Ŀ��ȼ۸� �� " + customCoffee2.cost());
		
	}

}
