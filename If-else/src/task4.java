
/*
Enter two different numbers from the console and print them out in
ascending order.
 
 */

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first value: ");
		double v1 = sc.nextDouble();

		System.out.println("enter second value: ");
		double v2 = sc.nextDouble();

		if (v1 == v2) {
			System.out.println("error: numbers have to be different");
			return;
		}
		
		if (v1 < v2) {
			System.out.println(v1 + " , " + v2);
		}
		
		else
			System.out.println(v2 + " , " + v1);
	}

}
