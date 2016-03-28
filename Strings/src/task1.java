/*
  To compile a program that introduces two strings containing
up to 40 uppercase and lowercase letters.
As a result, the screen displays the strings only with capital and only
with lowercase letters.

  */
  
package homework5;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String str1 = null;
		do {
		System.out.println("Enter first string (up to 40 symbols): ");
		str1 = sc.nextLine();
		} while (str1.length() > 40);
		
		String str2 = null;
		do {
		System.out.println("Enter second string (up to 40 symbols): ");
		str2 = sc.nextLine();
		} while (str2.length() > 40);
		
		System.out.println();
		System.out.println("First string:");
		System.out.println(str1.toLowerCase() + " , " + str1.toUpperCase());
		System.out.println("Second string:");
		System.out.println(str2.toLowerCase() + " , " + str2.toUpperCase());
		
	}

}
