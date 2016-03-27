/*
  Write a program that finds and displays the longest sequence of
identical consecutive elements in an array.

  */
  
package homework3;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number of elements: ");
		int num = sc.nextInt();
		
		char[] arr = new char[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i+1) + ": ");
			arr[i] = sc.next().charAt(0);
		}
		
		int counter = 1;
		int biggestCounter = 0;
		char tempElem = arr[0];
		char frequentElem = 0;
			
		  for(int j=1; j < arr.length; j++) {
			if(arr[j] == tempElem) {
				counter ++;
				if(counter > biggestCounter) {
					biggestCounter = counter;
					frequentElem = tempElem;
				}
			}
			else {
				counter = 1;
				tempElem = arr[j];
			}
	   }
		  
		  for(int i =1; i <= biggestCounter; i++) {
			  System.out.print(frequentElem + " ");
		  }

	}

}
