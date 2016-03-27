/*
  To compile a program that receives 7 integers
in a one-dimensional array
The program gives all numbers that can be divided by 5 but larger than 5.

  */
  
package homework3;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter value of element number " + (i+1) +": ");
			arr[i] = sc.nextInt();
		}
		
		int counter = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] > 5 && arr[i]%5 == 0) {
				counter++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("- " + counter + " numbers");

	}

}
