/*
  To compile a program that from an introduced string returns another string 
whose symbols, which are obtained as each code symbol
from an ASCII table is added the number 5 and is written the
new symbol.
  */
  
package homework5;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		char tempCh;
		StringBuilder newText = new StringBuilder (str);
		
		for(int i=0; i<str.length(); i++) {
			tempCh =(char)(str.charAt(i) + 5);
			newText.setCharAt(i, tempCh);
		}
		
		String newStr = newText.toString();
		System.out.println(newStr);
	}

}
