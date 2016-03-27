package homework2;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isPrime = true;
		int num;
		do {
			System.out.println("enter a number: ");
			num = sc.nextInt();
		} while (num <= 0);

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("number is prime");
		} else
			System.out.println("number is not prime");

	}

}
