/* You have two-dimensional array of numbers whose values are entered in
advance. To print the sum of the elements of the array,
and the average value of these numbers */

package homework4;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter rows: ");
		int rows = sc.nextInt();
		
		System.out.println("enter columns: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; 
			}
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + sum/(rows*cols));
	}

}
