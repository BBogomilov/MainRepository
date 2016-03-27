/*
 To compile a program that from given natural number
N from the range [10..200] displays in reverse
all numbers that can be divided by 7 and are smaller than N.
*/

package homework2;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		do {
			System.out.println("enter number between 10 and 200: ");
			num = sc.nextInt();
		} while (num < 10 || num > 200);

		for (int i = num; i > 0; i--) {
			if (i % 7 == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
