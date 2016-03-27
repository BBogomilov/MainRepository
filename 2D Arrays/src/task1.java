/* You have 6x5 two-dimensional array of integers whose values are
introduced in advance.
To compile a program that displays the elements of the array with
the smallest and largest value. */

package homework4;

public class task1 {

	public static void main(String[] args) {
		
		int[][] arr = {
						{0, 4, 8, 16, 7},
						{11, 14, 8, 19, 2},
						{6, 10, 15, 3, 1},
						{23, 20, 4, 7, 18},
						{38, 28, 20, 0, 0},
						{47, 5, 25, 8, 9}
				};
		
		int min = arr[0][0];
		int max = arr[0][0];
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println("Min element: " + min);
		System.out.println("Max element: " + max);
	}

}
