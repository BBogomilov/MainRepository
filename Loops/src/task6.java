/*
   To read a number on the screen and to print
out the sum of all the numbers between 1 and the entered the number.

  */
  
package homework2;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int num = sc.nextShort();

		int sum = 0;

		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				sum += i;
			}
		} else {

			for (int i = 1; i >= num; i--) {
				sum += i;
			}
		}

		System.out.println(sum);

	}

}
