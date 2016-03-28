/*
  To create a method that accepts for an input data integer N and
returns an array of integers with a length of N, which contains all the numbers
from 1 to N.
  */
  
package homework5;

import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter a positive number: ");
		int num = sc.nextInt();
		int arr[] = func(num);
		
		for(int i=0; i<arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			} else
			System.out.print(arr[i] + ", ");
		}

	}
	
	static int[] func (int n) {
		int[] masiv = new int[n];
		int counter = 1;

		
		for(int i=0; i<masiv.length; i++) {
			masiv[i] = counter++;
		}
		return masiv;
	}

}
