/*
 To compile a program that reads a set of words separated by
interval.
As a result to show the number of words typed, and the number
of signs in the longest word.

 */

package homework5;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter some words, separated by space: ");
		String str = sc.nextLine();
		
		int counterChars = 0;
		int maxChars =0;
		int counterWords = 0;
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) == ' ') {
				counterChars = 0;
			}
			else {
				if(i == 0 || (i != 0 && str.charAt(i - 1) == ' ')) {      //думите може да се разделят с повече от един "space"
					counterWords ++;
				}
				counterChars++;
				
				if(maxChars < counterChars) {
					maxChars = counterChars;
				}
				else continue;
			}
		}
		
		System.out.println("Number of words: " + counterWords + "\nBiggest word: " + maxChars + " symbols");

	}

}
