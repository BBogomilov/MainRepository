/*
  Must be entered a number, and then to be created an array of 10
element as follows:
The first two elements of the array are introduced numbers.
Each subsequent element of the array is equal to the sum of
its previous 2 elements in the array.
Then display the array.
  */
  
package homework3;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i == 0 || i == 1) {
				arr[i] = num;
			} else {
				sum = (arr[i - 1]) + (arr[i - 2]);
				arr[i] = sum;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
