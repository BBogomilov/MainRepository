/*
   To introduce user-2 numbers. And to
display all the numbers from least to greatest.
  */
  
package homework2;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1);
			return;
		}
		else if(num1 > num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}

	}

}
