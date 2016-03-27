
/*
 Enter three different numbers from the console and print them out in decreasing order.
 */

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first value: ");
		double v1 = sc.nextDouble();

		System.out.println("enter second value: ");
		double v2 = sc.nextDouble();

		System.out.println("enter third value: ");
		double v3 = sc.nextDouble();

		if ((v1 == v2) || (v2 == v3) || (v1 == v3)) {
			System.out.println("error: numbers have to be different");
			return;
		}

		if ((v1 > v2) && (v1 > v3)) {

			if (v2 > v3) {
				System.out.println(v1 + " , " + v2 + " , " + v3);
				return;
			}

			else {
				System.out.println(v1 + " , " + v3 + " , " + v2);
				return;
			}
		}

		if ((v2 > v1) && (v2 > v3)) {

			if (v1 > v3) {
				System.out.println(v2 + " , " + v1 + " , " + v3);
				return;
			}

			else {
				System.out.println(v2 + " , " + v3 + " , " + v1);
				return;
			}
		}

		if ((v3 > v2) && (v3 > v1)) {

			if (v1 > v2) {
				System.out.println(v3 + " , " + v1 + " , " + v2);
				return;
			}

			else {
				System.out.println(v3 + " , " + v2 + " , " + v1);
			}
		}

	}
}
