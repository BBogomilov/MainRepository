
/*
  To bring messages to the user and read 2 numbers from the 
keyboard - A and B (may be double).
Then read the third number C and verify that it was between A and B.
To display an appropriate message about whether C is between A and B.

 */

import java.util.Scanner;

public class task1 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first value: ");
		double value1 = sc.nextDouble();
		
		System.out.println("enter second value: ");
		double value2 = sc.nextDouble();
		
		System.out.println("enter third value: ");
		double value3 = sc.nextDouble();
		
		if ((value3 < value2 && value3 > value1) || (value3 > value2 && value3 < value1)) {
			System.out.println("the number " + value3 + " is between " + value1 + " and " + value2);
		}
		
		else
			System.out.println("the number " + value3 + " is NOT between " + value1 + " and " + value2);

	}
}
