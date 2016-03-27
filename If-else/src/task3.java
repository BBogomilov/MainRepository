/*
 Enter two different numbers from the console and swap their values.
Print the new values
 */

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first value: ");
		short v1 = sc.nextShort();

		System.out.println("enter second value: ");
		short v2 = sc.nextShort();

		if (v1 == v2){
			System.out.println("error: numbers have to be different");
			return;
		}
		
		short v1Value = v1;
		v1 = v2;
		v2 = v1Value;

		System.out.println("first: " + v1 + " , second: " + v2);

	}
}
