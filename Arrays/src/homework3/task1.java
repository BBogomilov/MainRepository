/*
  To read the array and find the smallest number divisible by
3 from the array.

  */
  
package homework3;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of elements: ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("enter value of element number " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		int min = 0;
		for (int j = 0; j < num; j++) {
			if (arr[j] != 0 && arr[j] % 3 == 0) {
				min = arr[j];
				flag = true;
				break;
			} else
				flag = false;
		}

		if (flag) {
			for (int j = 0; j < num; j++) {
				if (arr[j] != 0 && arr[j] % 3 == 0) {
					if (arr[j] < min) {
						min = arr[j];
					}
				} else
					continue;
			}
			System.out.println("Answer: " + min);
		} else
			System.out.println("there is no element which can be devided by 3.");
	}
} 
