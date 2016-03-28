package MortalKombat;

import java.util.Random;

public class Fighter {

	String name;
	int health=100;
	static int minDamage = 5;
	static int maxDamage = 15;
	static int kickMaxDamage = 20;
	static int kickMinDamage = 10;
	
	void punch(Fighter target) {
		target.health -= calcPunchDamage();
	}
	void die() {
		System.out.println(name + " is dead");	
	}
	void kick(Fighter target) {
		target.health -= calcKickDamage();
	}	
	
	boolean isDead() {
		return health<=0;
	}
	static int calcPunchDamage() {
		Random r = new Random();
		return r.nextInt(maxDamage - minDamage) + minDamage;
	}
	static int calcKickDamage() {
		Random r = new Random();
		return r.nextInt(kickMaxDamage-kickMinDamage) + kickMinDamage;
	}
}
