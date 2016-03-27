/*
  You have previously entered values of natural numbers
entered into a square table measuring 6 rows and 6 columns.
To compile a program which finds the sum of all
elements whose sum of indexes for row and column is an even number.
Program brings formed amounts for each row of the
square table, and the total sum of these elements.
Use only one cycle.
  */
  
package homework4;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] arr = new int[6][6];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				do {
					System.out.println("arr[" + i +"][" + j + "]:");
					arr[i][j] = sc.nextInt();
				} while (arr[i][j] < 0);
			}
		}
		
		int sum = 0;
		int wholeSum = 0;
		
		for(int i=0; i<arr.length; i++) {
		int c=0;
		boolean readyRow = false;
		
			if(!readyRow) {
					if ((i+c)%2 == 0) {
						System.out.print(arr[i][c] + ", ");
						sum += arr[i][c];
						if(c+1 > 5) {
							System.out.print(", sum of elements on this row is " + sum);
							System.out.println();
							wholeSum += sum;
							readyRow = true;
							sum=0;
						}
						else c++;
					}else
					if(c+1 > 5) {
						System.out.print(", sum of elements on this row is " + sum);
						System.out.println();
						wholeSum += sum;
						readyRow = true;
						sum=0;
					}
					else c++;
				}
		}

		
		System.out.println("Whole sum of elements is " + wholeSum);
	}

}
