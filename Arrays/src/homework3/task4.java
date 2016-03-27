/*
  To read an array and to print whether it is a mirror.
These arrays are mirrored:
[3 7 7 3]
[4]
[55 1 1]
[27 -1 5 6 7 7 5 6 -1 27]
  */
  
package homework3;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number of elements: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("enter value of element number " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		boolean flag = true;
		
		for(int i = 0; i <= arr.length/2; i++) {
			if (arr[i] == arr[arr.length-1-i]) {
				flag = true;
			}
			else flag = false;
			break;
		}
		System.out.println(flag ? "loop is reflexed" : "loop is NOT reflexed");

	}

}
