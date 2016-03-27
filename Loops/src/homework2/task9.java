/*
   To read the two numbers from the keyboard A and B.
To bring out all the numbers from A to B grade 2 (separated by
commas) .If one number can be divided by 3 to display a message that
the number is omitted "skip 3" .If the sum of all drawn numbers (without
omitted) becomes greater than 200, to suspend output.
  */
  
package homework2;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("enter second number: ");
		int num2 = sc.nextInt();

		int sum = 0;
		if (num1 > num2) {

			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		for (int i = num1; i <= num2; i++) {

			if (i % 3 == 0) {
				if (i == num2) {
					System.out.print("(skip 3)");
					break;
				}
				else
				System.out.print("(skip 3), ");
			} else {
				if (i == num2) {
					System.out.print(i * i);
					break;
				}
				else {
				System.out.print(i * i + ", ");
				sum += i * i;
				}
			}

			if (sum > 200)
				break;
		}

	}

}
