/*
  You have previously entered values of natural numbers.
The numbers are entered in a square table measuring 6 rows and 6
columns.
To compile a program which finds the sum of all
elements of rows with even numbers: 2,4 and 6.
The program displays the sum of each row.

  */
  
package homework4;

public class task6 {

	public static void main(String[] args) {
		
		int[][] arr = { 
						{14,12,0,23,15,16},
						{8,22,88,24,5,26},
						{31,32,33,34,7,36},
						{2,42,43,37,90,46},
						{51,52,8,54,31,10},
						{61,1,63,64,6,66}
				};

		int sum =0;
		int wholeSum = 0;
		
		for(int i = 1; i<arr.length; i+=2) {
			for(int j = 0; j<arr[i].length; j++) {
				if(j == arr[i].length-1) {
					System.out.print(arr[i][j]);
				} else
				System.out.print(arr[i][j] + ", ");
				
				sum += arr[i][j];
			}
			System.out.print("  Sum: " + sum);
			System.out.println();
			wholeSum += sum;
			sum = 0;
		}
		
		System.out.println("Whole sum: " + wholeSum);
		
	}

}
