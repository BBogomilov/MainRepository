/*
  To compile a program through which to put 7
numbers in a one-dimensional array interchange the elements with indices:
- 0 and 1 by a third variable;
- 2 and 3 by adding;
- 4 and 5 by multiplying
  */
  
package homework3;

import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter value of element number " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		
		arr[4] = arr[4]*arr[5];
		arr[5] = arr[4]/arr[5];
		arr[4] = arr[4]/arr[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
