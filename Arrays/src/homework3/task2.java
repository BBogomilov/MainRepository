/*
  From introduced array to be constructed a new one, half of its
elements to be exactly like the original array, while the others to be those
elements but in reverse order. Last, to display the new array
on the screen.

  */
  
package homework3;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number of elements: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		int[] newArr = new int[arr.length];
		
		if(num%2 != 0) {
		 newArr = new int[arr.length - 1];
		}
		
		for(int i=0; i < newArr.length/2; i++) {
			
			newArr[i] = arr[i];
			newArr[newArr.length -1-i] = newArr[i];
		}
		
		for(int i=0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
	}

}
