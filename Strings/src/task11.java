/*
  To establish a method that prints an array in the console.
  */
  
package homework5;

public class task11 {

	public static void main(String[] args) {
		
		int[] masiv1 = {4, -9, 5, 23, 18};
		int[][] masiv2 = {
							{1,6,7,3,2},
							{-94,7,9},
							{1,4,4,9,8},
							{-1,-4,62,15}	
		};
		
		print(masiv1);
		System.out.println();
		System.out.println();
		print2D(masiv2);
	}
	
	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void print2D(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
