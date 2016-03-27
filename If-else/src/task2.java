/*
Enter two different integer numbers from the console. Record
their sum, difference, product, and residue from division
integer division into separate variables and print these
results in the console. Try the same with numbers with floating point.

 */

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first value: "); // value1 == v1
		float v1 = sc.nextFloat();

		System.out.println("enter second value: "); // value2 == v2
		float v2 = sc.nextFloat();
		
		if (v1 == v2){
			System.out.println("error: numbers have to be different");
			return;
		}

		System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
		System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
		System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
		System.out.println(v1 + " % " + v2 + " = " + (v1 % v2));
		System.out.println(v1 + " / " + v2 + " = " + (v1 / v2));
	}

}
