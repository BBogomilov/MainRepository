/*
  To compile a program that introduces two numbers
in a range [1..9].
The program can display the multiplication table.
The maximum value of the multipliers is determined by the 2
numbers.
  */

package homework2;

import java.util.Scanner;

public class task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		do {
			System.out.println("enter first number between 1 and 9: ");
			a = sc.nextInt();
		} while (a < 1 || a > 9);

		int b;
		do {
			System.out.println("enter second number between 1 and 9: ");
			b = sc.nextInt();
		} while (b < 1 || b > 9);

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= b; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
