/*
  Write a program that first reads 2 arrays and then displays
message if they are identical or whether they are the same size.

  */
  
package homework3;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of elements for array 1: ");
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr1[i] = sc.nextInt();
		}

		System.out.println("enter number of elements for array 2: ");
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr2[i] = sc.nextInt();
		}

		boolean areEqual = true;

		if (arr1.length == arr2.length) {
			System.out.println("arrays have same lengths");
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					areEqual = false;
					break;
				} else
					continue;
			}
		} else {
			System.out.println("arrays have different lengths");
			areEqual = false;
		}

		System.out.println(areEqual ? "arrays are equal" : "arrays are not equal");
	}

}
