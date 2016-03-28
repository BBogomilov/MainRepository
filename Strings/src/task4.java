/*
To compile a program that from introduced three names of two
people comma-separated, prints whose name has a larger sum
from an ASCII codes constituting the name letters.
 */

package homework5;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String names = null;
		boolean check;

		do {
			check = true;
			System.out.println("enter the three names of two persons:\n(names of a person must be separated by a space and persons must be separated by a comma)");
			names = sc.nextLine();
		
			// Check whether there is a comma
			
				for (int j = 0; j < names.length(); j++) {
					if (names.charAt(j) != ',') {
						check = false;
					} else {
						check = true;
						break;
					}
				}

		} while (!check);

		int sum1 = 0;
		int counter = 0;

		for (int i = 0; names.charAt(i) != ','; i++) {
			if (names.charAt(i) != ' ') {
				sum1 += names.charAt(i);
			} 
			counter = i;
		}

		int sum2 = 0;

		for (int j = counter + 2; j < names.length(); j++) {
			if (names.charAt(j) != ' ' && names.charAt(j) != ',') { 
				sum2 += names.charAt(j);							
			} else													
				continue;
		}

		if (sum1 > sum2) {
			System.out.print("Name with higher sum: ");
			for (int i = 0; i <= counter; i++) {
				System.out.print(names.charAt(i));
			}
		} else if (sum1 < sum2) {
			System.out.print("Name with higher sum: ");
			for (int i = counter + 2; i < names.length(); i++) {
				System.out.print(names.charAt(i));
			}
		} else
			System.out.println("Sums of names are equal");

	}

}