/*
  To compile a program that introduces 7 integers
a one-dimensional array.
The program gave the number that is closest to the average
value of the entered numbers.

  */
  
package homework3;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {  // .. баси гадната задача :d
		
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		int avg = 0;
		for(int i =0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg = avg/arr.length;
		System.out.println("average value: " + avg);
		
		int nearestNum = 0;
		for(int i=0; i < arr.length; i++) {
			if (arr[i] == avg) {
				nearestNum = arr[i];
				System.out.println("nearest number: " + nearestNum);
				return;
			}
			else continue;
		}
		
		nearestNum = arr[0];
		int razlika = 0;
		if(arr[0] < avg) {
			razlika = avg - arr[0];
		}
		else {
			razlika = arr[0] - avg;
		}
		
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > avg) {
				if (arr[i] - avg < razlika) {
					nearestNum = arr[i];
					razlika = arr[i] - avg;
				}
				else continue;
			}
			else {
				if(avg - arr[i] < razlika) {
					nearestNum = arr[i];
					razlika = avg - arr[i];
				}
				else continue;
			}
		}

		System.out.println("nearest number to avg: " + nearestNum);
	}

}
