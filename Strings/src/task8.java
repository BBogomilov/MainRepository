/*
 To compile a program that introduces a line of symbols
(String).
Program must print on the screen if the entered string is a palindrome
i.e. if you read it from the left-to-right and from the right-to-left is the same.

 */

package homework5;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check;
		String word;

		do {
			check = true;
			System.out.println("Enter a word: ");
			word = sc.nextLine();
			
			for(int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == ' ') {
					check = false;
					break;
				}
				else continue;
			}
		} while (!check);

		boolean isPolyndrom = true;
		
		for(int i=0; i < word.length()/2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 -i)) {
				isPolyndrom = false;
				break;
			}
			else continue;
		}
		
		System.out.println(isPolyndrom);
		
	}

}
