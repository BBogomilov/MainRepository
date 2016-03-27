/*
  To compile a program that introduces a number which must be presented as 
a number in binary notation.
The program, through an array to calculate successively all figures
of the input integer in binary notation.

  */
  
package homework3;

import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		do {
			System.out.println("enter number: ");
			num = sc.nextInt();
		} while (num < 0);

		int arrLength = 0;
		int numValue = num;

		if (num == 0) {
			arrLength = 1;
		} else {
			while (numValue > 0) {
				arrLength++;
				numValue /= 2;
			}
		}

		long arr[] = new long[arrLength];

		for (int i = 0; i < arr.length; i++) {
			arr[arr.length - 1 - i] = num % 2;
			num /= 2;
		}

		System.out.println("Number in bynary form: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
