/*
Write a program which from a given three-digit number checks if it can 
divide with each of its digits. In the entered number there must not be a digit 0.

 */

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a three digit number without '0' in it: ");
		short num = sc.nextShort();

		if (num < 100 || num > 999) {
			System.out.println("error: number not in the accurate interval");
			return;
		}

		if ((num % 10) == 0 || (num / 10) % 10 == 0 || (num / 100) % 10 == 0) {
			System.out.println("error: digit '0' in number");
			return;
		}

		if (num % (num % 10) == 0 && num % ((num / 10) % 10) == 0 && num % (num / 100) % 10 == 0) {
			System.out.println("Yes");
		} else
			System.out.println("No");

	}

}
