/*
 Introduced a three-digit integer type abc.
You need to check whether:
if a = b = c - Output figures are equal;
if a> b> c - Output figures are ascending;
if a <b <c figures are in descending order;
and output: the figures are misplaced, for non-scheduled cases.
To compile a program that displays the result of the check
regulation of digits in the number.

 */

import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number between 100 and 999: ");
		short num = sc.nextShort();
		
		if(num < 100 || num > 999) {
			System.out.println("error: number not in the accurate interval");
			return;
		}
		
		if(num%10 == (num/10)%10 && (num/10)%10  == num/100) {
			System.out.println("numbers are equal");
		}
		else if ((num/100 > (num/10)%10 && num/100 > num%10) && ((num/10)%10 > num%10)) {
			System.out.println("decreasing order");
		}
		else if ((num/100 < (num/10)%10 && num/100 < num%10) && ((num/10)%10 < num%10)) {
			System.out.println("rising order");
		}
		else
			System.out.println("numbers are not ordered");

	}

}
