
/*
 You have to fill the tank with water. You have 2 buckets holding 2 and
3 liters and use them simultaneously.
To compile a program that displays how a given volume will overflow
the liquid with these buckets, i.e. how many times you will have to fill each of the
buckets. Buckets can't be used with partial amount of water.
 */

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter capacity (number between 10 and 9999): ");
		short cap = sc.nextShort();

		if (cap < 10 || cap > 9999) {
			System.out.println("error: number not in the accurate interval");
			return;
		}
		
		if (cap % 5 == 0) {
			System.out.println(cap / 5 + " time/times 2l bucket and 3l bucket at once");
			return;
		}

		else if (cap % 5 == 1) {

			System.out.println((cap - 5) / 5 + " times 2l bucket and 3l bucket at once");
			System.out.println("+ 2 times 3l bucket or 3 times 2l bucket");
			return;
		}

		else if ((cap % 5) % 2 == 0) {
			System.out.println(cap / 5 + " times 2l bucket and 3l bucket at once");
			System.out.println("+ " + (cap % 5) / 2 + " time/times 2l bucket ");
		}

		else if (cap % 5 == 3) {
			System.out.println(cap / 5 + " times 2l bucket and 3l bucket at once");
			System.out.println("+ 1 time 3l bucket ");
		}
	}

}
