/*
  To compile method that accepts a number N and returns
the value of the N! (N factorial).
  */
  
package homework5;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a positive number: ");
		int num = sc.nextInt();
		long result = fact(num);
		System.out.println(result);

	}

	static long fact(int n) {
		long res = 1;

		if (n == 0 || n == 1) {
			res = 1;
		} else {
			for (int i = 2; i <= n; i++) {
				res *= i;
			}
		}
		return res;

	}
}
