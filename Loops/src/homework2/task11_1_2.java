/*
Enter the number N via the console and output as
a result a triangle with height N:
 */

package homework2;

import java.util.Scanner;

public class task11_1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		  int num;
		  do { 
			  System.out.println("How big triangle do you want: ");
			  num = sc.nextInt();
		  } while (num <= 0);
		  
		  int numValue = num;
		  int j = 1;
		  int starsValue = 1;
		  
		  while(num > 0) {
		  
		  for(int i = numValue-j; i >= 0; i--) {
			  System.out.print(" "); 
			  }
		  
		  for(int stars = starsValue; stars > 0; stars--) {
			  System.out.print("*");
		      } 
		  System.out.println();
		  starsValue += 2;
		  j ++;
		  num --; 
		  } 
		 

		// As an additional exercise - 
		// draw the same triangle, but not filled.

		/* int num;
		do {
			System.out.println("How big triangle do you want: ");
			num = sc.nextInt();
		} while (num <= 0);

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num - i; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (i == num) {
					for (int m = 1; m <= num * 2 - 1; m++) {
						System.out.print("*");
					}
					break;
				} else {
					if (k == 1 || k == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		} */
	}

}
