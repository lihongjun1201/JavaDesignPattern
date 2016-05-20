package simplefactory;

/**
 * pizza抽象类
 * 包含基本的方法
 * @author AllenLee
 *
 */
public abstract class Pizza {

	public void prepare() {
		System.out.println("\n准备pizza...");
	}
	
	public void bake() {
		System.out.println("烘焙pizza...");
	}
	
	public void cut() {
		System.out.println("切片pizza...");
	}
	
	public void box() {
		System.out.println("打包pizza...\nPizza做好了！");
	}
	
}

/**
 * 奶油pizza
 * @author AllenLee
 *
 */
class CheesePizza extends Pizza{
	public CheesePizza() {
		System.out.println("创建奶油pizza");
	}
}

/**
 * 希腊pizza
 * @author AllenLee
 *
 */
class GreekPizza extends Pizza{
	public GreekPizza() {
		System.out.println("创建希腊pizza");
	}
}

/**
 * 意大利肠pizza
 * @author AllenLee
 *
 */
class PepperoniPizza extends Pizza{
	public PepperoniPizza() {
		System.out.println("创建意大利肠pizza");
	}
}

/**
 * 海鲜pizz
 * @author AllenLee
 *
 */
class ClamPizza extends Pizza{
	public ClamPizza() {
		System.out.println("创建海鲜pizza");
	}
}


/**
 * 蔬菜pizza
 * @author AllenLee
 *
 */
class VeggiePizza extends Pizza{
	public VeggiePizza() {
		System.out.println("创建蔬菜pizza");
	}
}
