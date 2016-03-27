/*
  A series of natural numbers will be called zigzag up
if the elements fulfill the conditions:
N1 <N2> N3 <N4> N5 <..
Write a program that checks whether entered into a one-dimensional
array numbers fulfill the above requirements.
  */
  
package homework3;

import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		do {
		System.out.println("enter number of elements (>2): ");
		num = sc.nextInt();
		} while (num < 3);

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			do{
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			} while (arr[i] < 0);
		}

		boolean isZipped = true;

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1] || arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				continue;
			} else {
				isZipped = false;
				break;
			}
		}

		if (isZipped) {
			if (arr[1] < arr[0] && arr[1] < arr[2]) {
				System.out.println("It's zipped up-down");
			} else
				System.out.println("It's zipped down-up");
		} else
			System.out.println("It's not zipped");

	}

}
