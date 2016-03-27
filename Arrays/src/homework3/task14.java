/*
  Have previously introduced a one-dimensional array containing real
numbers.
To compile a program that only select items from the
array which are with values from interval [-2.99..2.99], then they are printed in a new
array. The new array to be displayed.

  */
  
package homework3;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of elements: ");
		int num = sc.nextInt();

		double[] arr = new double[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr[i] = sc.nextDouble();
		}

		short counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				counter++;
			} else
				continue;
		}

		double[] newArr = new double[counter];
		for (int i = 0; i < newArr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArr[i] = arr[i];
			} else
				continue;
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

	}

}
