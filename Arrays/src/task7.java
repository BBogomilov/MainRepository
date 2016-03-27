/*
  Write a program that first reads an array and then creates a new
array of the same size as follows: the value of each
element of the second array to be equal to the sum of the previous and
the next element of the item from the first array. The first
and the last element of the second array should remain equal
to the first and last element of the first array.
To display the resulting array.

  */
  
package homework3;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of elements: ");
		int num = sc.nextInt();

		int[] arr1 = new int[num];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[arr1.length];

		arr2[0] = arr1[0];
		arr2[arr2.length - 1] = arr1[arr1.length - 1];
		
		for (int i = 1; i < arr2.length - 1; i++) {
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
