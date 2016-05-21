package strategypattern;

public class Killer extends Character {

	public Killer(String name, float health, float damage, WeaponBehavior weapon) {
		super(name, health, damage, weapon);
		// TODO Auto-generated constructor stub
		job = "-…± ÷-";
	}

	@Override
	public void attackEnemy() {
		// TODO Auto-generated method stub
		super.attackEnemy();
		weapon.useWeaponToAttack();
	
	}

}
