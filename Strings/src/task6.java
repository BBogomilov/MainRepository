/*
 To compile a program that introduces à sentence with separated
words.
As a result, the screen displays the same text, but each
word starts with a capital letter, and the next ones are small letters.
 */

package homework5;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your message: ");
		String str = sc.nextLine();

		boolean changedWord = false;
		StringBuilder text = new StringBuilder(str);
		
		for (int i = 0; i < text.length(); i++) {
			if (!changedWord) {
				if (text.charAt(i) != ' ') {    
					char temp = Character.toUpperCase(str.charAt(i));
					text.setCharAt(i, temp);
					changedWord = true;
				}
				else continue;
			}
			else {
				if(text.charAt(i) == ' ') {
					changedWord = false;
				}
				else continue;
			}
		}
		
		String strNew = text.toString();
		System.out.println(strNew);

	}

}
