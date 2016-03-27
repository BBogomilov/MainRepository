/*
   To compile a program which calculates the amount of
all numbers from 1 to a given number N.
Use cycle do-while.
  */
package homework2;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		int num = sc.nextInt();

		int counter = 1;
		int sum = 0;

		if (num > 0) {
			do {
				sum += counter;
				counter++;

			} while (counter <= num);
		}
		else {
			do {
				sum += counter;
				counter--;

			} while (counter >= num);
		}

		System.out.println(sum);
	}

}
