/*
  To compile a program that introduces dimensional array with real
numbers.
As output: Program brings those 3 different numbers, whose
absolute value forms the maximum total amount.

  */
  
package homework3;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		do {
			System.out.println("enter number of elements (> 2): ");
			num = sc.nextInt();
		} while (num < 3);

		double[] arr = new double[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr[i] = sc.nextDouble();
		}
		
		int check = 1;
		double temp1 = 0;
		double temp2 = 0;
		double temp3 = 0;
		double biggestNum1 = 0;
		double biggestNum2 = 0;
		double biggestNum3 = 0;

		for (int i = 0; i < arr.length; i++) {
			double temp0 ;
			
			if (i == 0) {
				biggestNum1 = arr[i];
			} 
			else {
				if (arr[i] != arr[i - 1]) {
					check++;
					
					if (arr[i] < 0) {
						temp0 = arr[i] * (-1);
					} else
						temp0 = arr[i];

					if (biggestNum1 < 0) {
						temp1 = biggestNum1 * (-1);
					} else
						temp1 = biggestNum1;

					if (biggestNum2 < 0) {
						temp2 = biggestNum2 * (-1);
					} else
						temp2 = biggestNum2;

					if (biggestNum3 < 0) {
						temp3 = biggestNum3 * (-1);
					} else
						temp3 = biggestNum3;

					if (temp0 > temp1) {
						biggestNum3 = biggestNum2;
						biggestNum2 = biggestNum1;
						biggestNum1 = arr[i];
					}

					else if (temp0 > temp2) {
						biggestNum3 = biggestNum2;
						biggestNum2 = arr[i];
					}

					else if (temp0 > temp3) {
						biggestNum3 = arr[i];
					}

					else continue;
				}
				else continue;
			}
		}
		
		if (check < 3) {
			System.out.println("there aren't three different elements");
		} else
			System.out.print(biggestNum3 + " " + biggestNum2 + " " + biggestNum1);
	}

}