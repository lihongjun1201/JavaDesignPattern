package observerpattern;

public abstract class Beverage {

	String description;
	
	public Beverage() {
		description = "星巴克咖啡";
	}
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * 抽象的计价方法
	 * 由不同子类实现
	 * @return
	 */
	public abstract float cost(); 
	
}
