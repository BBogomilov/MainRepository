/*
  Leap years are all years divisible by 4 with exceptions
centuries, but centuries multiples of 400, i.e., 1900 is not a leap,
but 1600 and 2000 are leap.
Write a program that, for given day, month and year prints
next date.

 */
import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number between 1 and 31 (day): ");
		short day = sc.nextShort();

		if (day < 1 || day > 31) {
			System.out.println("error: number not in the accurate interval");
			return;
		}

		System.out.println("enter a number between 1 and 12 (month): ");
		short month = sc.nextShort();

		if (month < 1 || month > 12) {
			System.out.println("error: number not in the accurate interval");
			return;
		}

		System.out.println("enter a positive number (year): ");
		int year = sc.nextInt();

		if (year <= 0) {
			System.out.println("error: number not in the accurate interval");
			return;
		}

		boolean leapYear = false;

		if (year % 400 == 0) {
			leapYear = true;
		}

		else if (year % 4 == 0) {
			leapYear = true;
		}

		if (day == 31 && month == 1) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		}

		if (leapYear) {
			if (day == 28 && month == 2) {
				System.out.println(29 + "." + month + "." + year);
				return;
			} else if (day == 29 && month == 2) {
				System.out.println(1 + "." + ++month + "." + year);
				return;
			} else if (day >= 30 && month == 2) {
				System.out.println("no such day");
				return;
			}
		}

		else {
			if (day >= 29 && month == 2) {
				System.out.println("no such day");
				return;
			} else if (day == 28 && month == 2) {
				System.out.println(1 + "." + ++month + "." + year);
				return;
			}
		}
		if (day == 31 && month == 3) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		}

		if (day == 30 && month == 4) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		} else if (day > 30 && month == 4) {
			System.out.println("no such day");
			return;
		}

		if (day == 31 && month == 5) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		}

		if (day == 30 && month == 6) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		} else if (day > 30 && month == 6) {
			System.out.println("no such day");
			return;
		}

		if (day == 31 && month == 7) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		}

		if (day == 31 && month == 8) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		}

		if (day == 30 && month == 9) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		} else if (day > 30 && month == 9) {
			System.out.println("no such day");
			return;
		}

		if (day == 31 && month == 10) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		}

		if (day == 30 && month == 11) {
			System.out.println(1 + "." + ++month + "." + year);
			return;
		} else if (day > 30 && month == 11) {
			System.out.println("no such day");
			return;
		}

		if (day == 31 && month == 12) {
			System.out.println(1 + "." + 1 + "." + ++year);
			return;
		}

		System.out.println(++day + "." + month + "." + year);
	}

}
