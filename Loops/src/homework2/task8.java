/*
   By a set number n, to display a table
follows: ....
  */
  
package homework2;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int n = sc.nextInt();

		int nValue_1 = n;
		int nValue_2 = n;
		int nValueConst = n;

		while (nValue_2 > 0) {

			while (nValue_1 > 0) {
				System.out.print(n - 1);
				nValue_1--;
			}

			System.out.println();
			n += 2;
			nValue_2--;
			nValue_1 = nValueConst;
		}

	}

}
