/*
  Write a program in which the user enters array, then the
elements of the array are turning in reverse order (goal is not to
print the array in reverse order, but first to be reversed, then to
by printed in normal order). Try to solve the problem first with one
additional array and then without using another array.

  */
  
package homework3;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number of elements: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i=0; i<arr.length; i++) {
		System.out.println("enter value of element number " + (i+1) + ": ");
		arr[i] = sc.nextInt();
		}
		
		// 1-ви начин:
		
		/* int[] newArr = new int[arr.length];
		
		for(int i=0; i < newArr.length; i++) {
			newArr[i] = arr[arr.length -1 -i];
			System.out.print(newArr[i] + " ");
		} */
		
		//2-ри начин:
		
		for(int i=0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
	}

}
