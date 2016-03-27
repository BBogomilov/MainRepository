/*
  To make a program in which in advance are introduced
integers in two-dimensional array 4 * 4.
The program displays the result of what is the aspect
of the largest amount in rows with the largest amount in the columns.

  */
  
package homework4;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] arr = new int[4][4];
		
		for (int i=0 ; i<arr.length; i++) {
			for (int j =0; j<arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int rowSum =0;
		int maxRowSum = 0;
		
		for(int i =0; i<arr[0].length; i++) {
			maxRowSum += arr[0][i];
		}
		
		
		int colSum =0;
		int maxColSum = 0;
		
		for(int i =0; i<arr.length; i++) {
			maxColSum += arr[i][0];
		}
		
		
		for(int i =1; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				rowSum += arr[i][j];
			}
			if(rowSum > maxRowSum) {
				maxRowSum = rowSum;
			}
			rowSum =0;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr[i].length; j++) {
				colSum += arr[i][j];
			}
			if(colSum > maxColSum) {
				maxColSum = colSum;
			}
			colSum =0;
		}
		
		System.out.println("Max row sum: " + maxRowSum);
		System.out.println("Max column sum: " + maxColSum);
		
		if(maxRowSum > maxColSum) {
			System.out.println("Max row sum is higher than max column sum");			
		}
		else if (maxRowSum < maxColSum) {
			System.out.println("Max column sum is higher than max row sum");
		}
		else System.out.println("Max row sum is equal to max column sum");
	}

}
