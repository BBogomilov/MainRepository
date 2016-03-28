/*
  Write a method that takes an array of strings and prints them one per
line in a rectangular frame.
 */

import java.util.Scanner;

public class WordsInFrame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number of words: ");
		int num = sc.nextInt();
		String[] str = new String[num];
		for(int i=0; i<str.length; i++) {
			System.out.print("word number " + (i+1) + ": ");
			str[i] = sc.next();
		}
		print(str);

	}
	
	static void print(String[] str) {
		int maxLength=0;
		for(int i=0; i<str.length; i++) {
			if(str[i].length() > maxLength) {
				maxLength = str[i].length();
			}
		}
		for(int i=0; i<str.length+2; i++) {
			if(i==0 || i == str.length+1) {
				for(int j=0; j<maxLength+2; j++) {
					System.out.print("#");
				}
			}
			else {
				System.out.print("#" + str[i-1]);
				if(str[i-1].length() < maxLength) {
					for(int j=0; j<maxLength - str[i-1].length(); j++) {
						System.out.print(" ");
					}
				}
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
