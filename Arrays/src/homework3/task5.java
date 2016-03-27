/*
  Write a program that creates an array with 10 elements and
initializes each of the elements with a value equal to the index of
elements multiplied by 3.
To bring out the elements on the screen
  */
  
package homework3;

public class task5 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = i*3;
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
