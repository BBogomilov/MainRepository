/*
  They are given two-dimensional arrays of integers.
To compile a program that compares all the numbers with the same
indices of both arrays and records in a third array the greater of
both numbers.
To display the contents of the three array
  */
  
package homework3;

public class task18 {

	public static void main(String[] args) {
		
		int[] arr1 = {15, 6, 2, 9, 33, 10, 12};  // arrays must be the same size
		int[] arr2 = {9, 16, 18, 3, 40, 19, 1};
		int[] arr3 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] > arr2[i]) {
				arr3[i] = arr1[i];
			}
			else arr3[i] = arr2[i];
		}
		
		System.out.print("First array: ");
		for(int i=0; i<arr1.length; i++) {
			if (i == arr1.length-1) {
				System.out.print(arr1[i]);
			} else
			System.out.print(arr1[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Second array: ");
		for(int i=0; i<arr2.length; i++) {
			if (i == arr2.length-1) {
				System.out.print(arr2[i]);
			} else
			System.out.print(arr2[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Third array: ");
		for(int i=0; i<arr3.length; i++) {
			if (i == arr3.length-1) {
				System.out.print(arr3[i]);
			} else
			System.out.print(arr3[i] + ", ");
		}

	}

}
