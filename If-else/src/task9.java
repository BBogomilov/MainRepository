
/*
 To compile a program that reads from the console 2 natural
2-digit numbers a, b.
The program must print out whether the last digit of
the product of the two numbers is even, and the digit itself.
Input data: a, b - integers from interval [10..99]
 */

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number between 10 and 99 (a): ");
		byte a = sc.nextByte();

		System.out.println("enter second number between 10 and 99 (b): ");
		byte b = sc.nextByte();

		if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
			System.out.println("Error: there is number not in the accurate interval");
			return;
		}

		System.out.println(a + " * " + b + " = " + a * b);

		if ((a * b) % 2 == 0) {
			System.out.println((a * b) % 10 + " is even");
		}
		else
			System.out.println((a * b) % 10 + " is not even");
	}

}
