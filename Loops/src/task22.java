/*
  To compile a program that displays the top 10 small
numbers that are divisible by 2, 3 or 5 and which are larger than
introduced integer.
The numbers are displayed along with the serial number.
Input data: number of interval [1..999]
Example 1
Output: 1: 2; 2: 3, 3: 4, 4: 5, 5: 6, 6: 8, 7: 9, 8:10, 9:12, 10:14
Use while cycle.
  */
  
package homework2;

import java.util.Scanner;

public class task22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		do {
			System.out.println("enter a number between 1 and 999: ");
			num = sc.nextInt();
		}while (num < 1 || num > 999);
		
		byte counter = 1;
		int i = num + 1;
		while(counter <= 10) {
			if (i%2 == 0 || i%3 == 0 || i%5 == 0) {
				System.out.print(counter + ". " + i + ", ");
				counter ++;
			}
			i++;
		}
	}

}
