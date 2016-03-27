/*
  To compile a program that displays all
natural three-digit numbers that have sum of their digits equal
of the number.
A: sum, where 2> = sum <= 27.
 */

package homework2;

import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int sum;
		do {
		System.out.println("enter sum: ");
		sum = sc.nextInt();
		} while (sum < 2 || sum > 27);
		
		for(int i = 100; i <= 999; i++) {
			if((i%10 + (i/10)%10 + i/100) == sum) {
				System.out.print(i + ", ");
			}
			else continue;
		}

	}

}
