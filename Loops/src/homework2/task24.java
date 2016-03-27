/*
  A number X is a palindrome If read equally front and back.
To compile a program that checks whether the entered number is
palindrome.
Input: N - a natural number from the interval [10 .. 30000]

  */
  
package homework2;

import java.util.Scanner;

public class task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		do {
			System.out.println("enter number between 10 and 30 000: ");
			num = sc.nextInt();
		} while (num < 10 || num > 30000);

		int numValue = num;
		int newNumber = 0;
		int counter = 10;
		do {
			newNumber = newNumber * counter + (num % 10)  ;
			num /= 10;
		}while (num > 0);
		
		if(newNumber == numValue) {
			System.out.println("number is polyndrom");
		}
		else System.out.println("number is NOT polyndrom");
	}

}
