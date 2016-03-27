/*
  To compile a program that previously entered 10
real numbers in the interval are processed in the following manner:
1. Displays current numbers.
2. All items with a value less than -0.231 are replaced by
the sum of the square of their serial number + 41.25 and all
other elements are replaced with the work between the element
and his serial number. The serial number of the first element is 1.
3. To bring items from the first and from the new array.
  */
  
package homework3;

import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float[] arr = new float[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr[i] = sc.nextFloat();
		}

		System.out.print("Old: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else
				System.out.print(arr[i] + ", ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -0.231) {
				arr[i] =(float) ((i + 1) * (i + 1) + 41.25);
			} else {
				arr[i] = arr[i] * (i + 1);
			}
		}
		System.out.println();
		System.out.print("New: ");
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

	}

}
