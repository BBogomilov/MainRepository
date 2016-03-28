package MortalKombat;

import java.util.Random;

public class Battle {

	public static void main(String[] args) {

		Fighter fighter1 = new Fighter();
		fighter1.name = "Scorpio";
		Fighter fighter2 = new Fighter();
		fighter2.name = "Subzero";

		while (true) {
			Random r = new Random();
			if (r.nextBoolean()) {
				fighter2.punch(fighter1);
				System.out.println(fighter2.name + " hit " + fighter1.name);
				System.out.println(fighter1.name + ": " + fighter1.health);
			} else {
				fighter2.kick(fighter1);
				System.out.println(fighter2.name + " kick " + fighter1.name);
				System.out.println(fighter1.name + ": " + fighter1.health);
			}
			if (fighter1.isDead()) {
				fighter1.die();
				break;
			}

			if (r.nextBoolean()) {
				fighter1.punch(fighter2);
				System.out.println(fighter1.name + " hit " + fighter2.name);
				System.out.println(fighter2.name + ":" + fighter2.health);
			} else {
				fighter1.kick(fighter2);
				System.out.println(fighter1.name + " kick " + fighter2.name);
				System.out.println(fighter2.name + ": " + fighter2.health);
			}

			if (fighter2.isDead()) {
				fighter2.die();
				break;
			}
		}
	}

}
