/*
  To compile a program that introduces two words
with length of 10-20 characters.
Program to exchange their first 5 characters and to print the length
of the longer one and also their new content.

  */
  
package homework5;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check1;
		String str1 = null;
		do {
			check1 = true;
			System.out.println("Enter first word (between 10 and 20 letters): ");
			str1 = sc.nextLine();
			if (str1.length() < 10 || str1.length() > 20) {
				check1 = false;
			} else {
				/*	String temp1 = str1.toLowerCase();
							for (int i = 0; i < str1.length(); i++) {    
					if (temp1.charAt(i) < 'a' || temp1.charAt(i) > 'z') {  
						check1 = false;
						break;
					} else
						continue;
				}*/
					
				
				continue;
			}

		} while (!check1);

		boolean check2;
		String str2 = null;
		do {
			check2 = true;
			System.out.println("Enter second word (between 10 and 20 letters): ");
			str2 = sc.nextLine();
			if (str2.length() < 10 || str2.length() > 20) {
				check2 = false;
			} else {
			/*	for (int i = 0; i < str2.length(); i++) {
					String temp2 = str2.toLowerCase();
					if (temp2.charAt(i) < 'a' || temp2.charAt(i) > 'z') {
						check2 = false;
						break;
					} else
						continue;
				}*/
				continue;
			}
		} while (!check2);

		System.out.println();

		// exchanging the first 5 characters of the 2 words:

		if (str1.length() > str2.length()) {
			System.out.print(str1.length() + " ");

			StringBuilder text = new StringBuilder(str1);
			for (int i = 0; i < 5; i++) {
				text.setCharAt(i, str2.charAt(i));
			}
			String new1 = text.toString();
			System.out.print(new1);

		} else if (str1.length() < str2.length()) {
			System.out.print(str2.length() + " ");

			StringBuilder text = new StringBuilder(str2);
			for (int i = 0; i < 5; i++) {
				text.setCharAt(i, str1.charAt(i));
			}
			String new2 = text.toString();
			System.out.print(new2);
		} else {
			System.out.println("elements are with equal lengths");

			StringBuilder text1 = new StringBuilder(str1);
			for (int i = 0; i < 5; i++) {
				text1.setCharAt(i, str2.charAt(i));
			}
			String new1 = text1.toString();

			StringBuilder text2 = new StringBuilder(str2);
			for (int i = 0; i < 5; i++) {
				text2.setCharAt(i, str1.charAt(i));
			}
			String new2 = text2.toString();

			System.out.println(new1 + " " + new2);
		}
	}
}
