package factorymethodpattern;

import simplefactory.Pizza;


/**
 * 抽象的产品基类
 * 
 * 可以派生出许多不同的具体产品类
 * @author AllenLee
 *
 */
public abstract class AbstractPizza {

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


//具体不同风味的pizza子类
//纽约风味pizza店具体的pizza产品
//-------------------------------------------------------------------------------
/**
 * 奶油pizza
 * @author AllenLee
 *
 */
class NYCheesePizza extends AbstractPizza{
	public NYCheesePizza() {
		System.out.println("创建纽约风味奶油pizza");
	}
}

/**
 * 希腊pizza
 * @author AllenLee
 *
 */
class NYGreekPizza extends AbstractPizza{
	public NYGreekPizza() {
		System.out.println("创建纽约风味希腊pizza");
	}
}

/**
 * 意大利肠pizza
 * @author AllenLee
 *
 */
class NYPepperoniPizza extends AbstractPizza{
	public NYPepperoniPizza() {
		System.out.println("创建纽约风味意大利肠pizza");
	}
}

/**
 * 海鲜pizz
 * @author AllenLee
 *
 */
class NYClamPizza extends AbstractPizza{
	public NYClamPizza() {
		System.out.println("创建纽约风味海鲜pizza");
	}
}


/**
 * 蔬菜pizza
 * @author AllenLee
 *
 */
class NYVeggiePizza extends AbstractPizza{
	public NYVeggiePizza() {
		System.out.println("创建纽约风味蔬菜pizza");
	}
}



//洛杉矶pizza店具体的pizza产品
//-----------------------------
/**
 * 奶油pizza
 * @author AllenLee
 *
 */
class LACheesePizza extends AbstractPizza{
	public LACheesePizza() {
		System.out.println("创建洛杉矶风味奶油pizza");
	}
}

/**
 * 希腊pizza
 * @author AllenLee
 *
 */
class LAGreekPizza extends AbstractPizza{
	public LAGreekPizza() {
		System.out.println("创建洛杉矶风味希腊pizza");
	}
}

/**
 * 意大利肠pizza
 * @author AllenLee
 *
 */
class LAPepperoniPizza extends AbstractPizza{
	public LAPepperoniPizza() {
		System.out.println("创建洛杉矶风味意大利肠pizza");
	}
}

/**
 * 海鲜pizz
 * @author AllenLee
 *
 */
class LAClamPizza extends AbstractPizza{
	public LAClamPizza() {
		System.out.println("创建洛杉矶风味海鲜pizza");
	}
}


/**
 * 蔬菜pizza
 * @author AllenLee
 *
 */
class LAVeggiePizza extends AbstractPizza{
	public LAVeggiePizza() {
		System.out.println("创建洛杉矶风味蔬菜pizza");
	}
}

