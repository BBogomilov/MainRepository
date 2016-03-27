/*
  To make a program that,from given number N, to calculate
N !, ie 1 * 2 * 3 * 4 ... * N.
Use cycle do-while.

  */
  
package homework2;

import java.util.Scanner;

public class task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		do {
			System.out.println("enter number: ");
			num = sc.nextInt();
		}while (num <= 0);

		int counter = 1;
		int result = 1;
		do {
			result *= counter;
			counter++;
		}while(counter <= num);
		System.out.println("Result: " + result);
	}

}
