/*
  You have previously entered values of the elements in two-dimensional
array - natural numbers.
To compile a program that displays values
of elements in the two-dimensional array after its conversion to + 90 degrees.

  */
  
package homework4;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of rows and columns: ");
		int num = sc.nextInt();

		int[][] arr = new int[num][num];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				do {
					System.out.println("arr[" + i + "][" + j + "]:");
					arr[i][j] = sc.nextInt();
				} while (arr[i][j] < 0);
			}
		}

		int[][] arr2 = new int[num][num];
		int m = 0;
		int n = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[i][j] = arr[n][m];
				n--;
			}
			m++;
			n = arr.length - 1;
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
