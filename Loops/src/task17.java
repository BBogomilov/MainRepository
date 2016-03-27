/* To compile a program that displays a square whose sides are
shaped with a sign "*" and the interior is filled with a given
sign.
Input b - length of the side within the interval
[3..20], c - a sign.
Program must use for cycle. */

package homework2;

import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int b;
		do {
			System.out.println("how big square do you want(from 3 to 20): ");
			b = sc.nextInt();
		} while (b < 3 || b > 20);

		System.out.println("enter a symbol: ");
		char c = sc.next().charAt(0);

		for (int i = 1; i <= b; i++) {
			if (i == 1 || i == b) {
				for (int k = 1; k <= b; k++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= b; j++) {
					if (j == 1 || j == b) {
						System.out.print("*");
					} else
						System.out.print(c);
				}
			}
			System.out.println();
		}

	}

}
