
/*
To compile a program that reads from the console 4-digit
natural number from the interval [1000 .. 9999]. From that number you must
form 2 new 2-digit numbers. The first number is formed by the 1st
and fourth digit of the entered number. The second number is formed by the second
and the third digit of the entered number. As result check if the first number is greater
or smaller than the second one or they are even.

 */

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number between 1000 and 9999: ");
		short num = sc.nextShort();

		if (num < 1000 || num > 9999) {
			System.out.println("number not in the accurate interval");
			return;
		}

		int num1 = (num % 10) + 10 * (num / 1000);
		int num2 = ((num / 10) % 10) + 10 * ((num / 100) % 10);

		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
			
		} else if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
			
		} else
			System.out.println(num1 + " = " + num2);
	}

}
