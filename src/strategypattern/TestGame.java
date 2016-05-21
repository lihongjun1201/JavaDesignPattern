package strategypattern;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javafx.print.PageLayout;

public class TestGame {

	public static void main(String[] args) {

		Character player = new Killer("allen", 100f, 60f, new Knife());
		

		player.attackEnemy();
		player.changeWeapon(new LightBow());
		player.attackEnemy();
		
		System.out.println("*******************************************");
		//--------------------Œ‰∆˜¿‡∏¥”√--------------------------
		player = new Magician("fay", 90f, 70f, new LightBow());
		player.attackEnemy();
		player.changeWeapon(new Knife());
		player.attackEnemy();
	}
}
