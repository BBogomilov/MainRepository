/*
   To compile a program that from an introduced
natural number from the interval [10..99] displays series of
numbers, which meets the following requirements:
1) if the previous number is even, displays 0.5 * number;
2) if the previous number is odd, displays the number * 3 + 1.
The output continues until a value of 1.
  */

package homework2;

import java.util.Scanner;

public class task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		do {
			System.out.println("enter a number between 10 and 99: ");
			num = sc.nextInt();
		} while (num < 10 || num > 99);

		System.out.print(num + ", ");
		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
				System.out.print(num + ", ");
			} else {
				num = num * 3 + 1;
				System.out.print(num + ", ");
			}
		}
	}

}
