package strategypattern;

public class Magician extends Character {

	public Magician(String name, float health, float damage,
			WeaponBehavior weapon) {
		super(name, health, damage, weapon);
		// TODO Auto-generated constructor stub
		job = "-ħ��ʦ-";
	}

	@Override
	public void attackEnemy() {
		// TODO Auto-generated method stub
		super.attackEnemy();
		weapon.useWeaponToAttack();
	}

}
