/* You have square two-dimensional array of integers whose values must be entered from
the console. To print the diagonals of the array. */

package homework4;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of rows and columns: ");
		int num = sc.nextInt();

		int[][] arr = new int[num][num];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]:");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print("Main diagonal: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}

		System.out.println();
		System.out.print("Secondary diagonal: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i + j == arr.length - 1) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}

	}
}
