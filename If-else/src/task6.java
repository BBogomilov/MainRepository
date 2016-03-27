
/*
 Enter three numbers from the keypad a1, a2 and a3. Swap their values
 so that a1 will have the value of a2, a2 have the value of a3 and
a3 have the old value of a1.
 */

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number (a1): ");
		float a1 = sc.nextFloat();

		System.out.println("enter second number(a2): ");
		float a2 = sc.nextFloat();

		System.out.println("enter third number(a3): ");
		float a3 = sc.nextFloat();

		float a1Value = a1;

		a1 = a2;
		a2 = a3;
		a3 = a1Value;

		System.out.println("a1= " + a1 + " , a2= " + a2 + " , a3= " + a3);

	}

}
