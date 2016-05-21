package strategypattern;

import java.awt.datatransfer.FlavorTable;

/**
 * 抽象角色类
 * 
 * @author AllenLee
 *
 */

public abstract class Character {

	protected String job;
	protected String name;
	protected float health;
	protected float damage;

	WeaponBehavior weapon;

	public Character(String name, float health, float damage,
			WeaponBehavior weapon) {
		super();
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.weapon = weapon;
	}

	/**
	 * 玩家武器类 设为抽象接口 留给各种具体武器子类定义
	 * 
	 * @param w
	 */
	public void changeWeapon(WeaponBehavior w) {
		System.out.println(name + "更换了武器！\n");
		this.weapon = w;
	}

	/**
	 * 攻击敌人
	 */
	public void attackEnemy() {
		System.out.println(job + name);
	}

}
