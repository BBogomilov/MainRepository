/*
  To compile a program that receives 2 natural
integers N, M in the interval [10..5555].
Program by for cycle, to display all numbers from the 
interval which can be divided by 50 in descending order.
  */
package homework2;

import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		do {
			System.out.println("enter first number between 10 and 5555: ");
			num1 = sc.nextInt();

		} while (num1 < 10 || num1 > 5555);

		do {
			System.out.println("enter second number between 10 and 5555: ");
			num2 = sc.nextInt();

		} while (num2 < 10 || num2 > 5555);

		if (num1 == num2) {
			if (num1 % 50 == 0) {
				System.out.println(num1);
			}
		}

		else if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		for (int i = num2; i >= num1; i--) {
			if (i % 50 == 0) {
				System.out.print(i + ", ");
			}

		}
	}

}
