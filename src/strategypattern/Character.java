package strategypattern;

import java.awt.datatransfer.FlavorTable;

/**
 * �����ɫ��
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
	 * ��������� ��Ϊ����ӿ� �������־����������ඨ��
	 * 
	 * @param w
	 */
	public void changeWeapon(WeaponBehavior w) {
		System.out.println(name + "������������\n");
		this.weapon = w;
	}

	/**
	 * ��������
	 */
	public void attackEnemy() {
		System.out.println(job + name);
	}

}
