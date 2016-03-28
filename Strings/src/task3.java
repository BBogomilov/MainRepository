/*
  To compile a program that reads two
rows of characters without spaces.
The program prompts the outcome of the comparison in
positions.

  */
  
package homework5;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check1;
		String str1;

		do {
			check1 = true;
			System.out.println("enter first string (without empty spaces): ");
			str1 = sc.nextLine();

			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == ' ') {
					check1 = false;
					break;
				} else
					continue;
			}
		} while (!check1);

		boolean check2;
		String str2;

		do {
			check2 = true;
			System.out.println("enter second string (without empty spaces): ");
			str2 = sc.nextLine();

			for (int i = 0; i < str1.length(); i++) {
				if (str2.charAt(i) == ' ') {
					check2 = false;
					break;
				} else
					continue;
			}
		} while (!check2);

		System.out.println();
		
		if (str1.length() > str2.length()) {
			System.out.println("First string is with bigger length");

			for (int i = 0; i < str2.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					continue;
				} else {
					System.out.println("on position number " + (i + 1) + " symbols are different: " + str1.charAt(i)
							+ " - " + str2.charAt(i));
				}
			}

		} else if (str1.length() < str2.length()) {
			System.out.println("Second string is with bigger length");

			for (int i = 0; i < str1.length(); i++) {
				if (str2.charAt(i) == str1.charAt(i)) {
					continue;
				} else {
					System.out.println("on position number " + (i + 1) + " symbols are different: " + str1.charAt(i)
							+ " - " + str2.charAt(i));
				}
			}

		} else {
			System.out.println("Strings are with equal length");

			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					continue;
				} else {
					System.out.println("on position number " + (i + 1) + " symbols are different: " + str1.charAt(i)
							+ " - " + str2.charAt(i));
				}
			}
		}

	}

}
