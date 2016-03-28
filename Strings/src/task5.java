/*
To compile a program that introduces two rows of characters
(Words).
If two lines involved the same sign, must print on the screen
first row horizontally and the second vertically, so as to
intersect in their common character.
If the rows don't have a common sign, must display only notifying
message.
 */

package homework5;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check1;
		String word1 = null;
		do {
			check1 = true;
			System.out.println("Enter first word: ");
			word1 = sc.nextLine();

			for (int i = 0; i < word1.length(); i++) {
				if (word1.charAt(i) == ' ') {
					check1 = false;
					break;
				} else
					continue;
			}
		} while (!check1);

		
		boolean check2;
		String word2 = null;
		do {
			check2 = true;
			System.out.println("Enter second word: ");
			word2 = sc.nextLine();

			for (int i = 0; i < word2.length(); i++) {
				if (word2.charAt(i) == ' ') {
					check2 = false;
					break;
				} else
					continue;
			}
		} while (!check2);
		
		
		boolean flag = false;
		int space = 0;
		int index = 0;
		
		check:
		for(int i=0; i<word1.length();i++) {
			for(int j=0; j<word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					flag = true;
					space = i;
					index = j;
					break check;
				}
			}
		}
		
		if(flag) {
			for(int i=0; i<word2.length(); i++) {
				if(i == index) {
					System.out.println(word1);
				}
				else {
					int spaceConst = space;
					while (space > 0) {
						System.out.print(" ");
						space--;
					}
					space = spaceConst;
					System.out.print(word2.charAt(i));
					System.out.println();
					
				}
			}
		}
		else System.out.println("No match");

	}
}
