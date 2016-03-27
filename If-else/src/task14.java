
/*
 To compile a program that recieves 2 positions from 
the chessboard and displays answer whether they are colored the same or
different color.
The chessboard is square.
Introduced two sets of numbers from the interval [1..8].

 */

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter chackmate coordinates between 1 and 8: ");
		byte coord1_1 = sc.nextByte();
		byte coord1_2 = sc.nextByte();

		if ((coord1_1 < 1 || coord1_1 > 8) || (coord1_2 < 1 || coord1_2 > 8)) {
			System.out.println("error: there is coordinate value not in the accurate interval");
			return;
		}

		System.out.println("enter chackmate coordinates between 1 and 8: ");
		byte coord2_1 = sc.nextByte();
		byte coord2_2 = sc.nextByte();

		if ((coord2_1 < 1 || coord2_1 > 8) || (coord2_2 < 1 || coord2_2 > 8)) {
			System.out.println("error: there is coordinate value not in the accurate interval");
			return;
		}

		boolean isBlack_1 = false;
		boolean isBlack_2 = false;

		if (coord1_1 % 2 != 0 && coord1_2 % 2 != 0) {
			isBlack_1 = true;
		} else if (coord1_1 % 2 == 0 && coord1_2 % 2 == 0) {
			isBlack_1 = true;
		}

		if (coord2_1 % 2 != 0 && coord2_2 % 2 != 0) {
			isBlack_2 = true;
		} else if (coord2_1 % 2 == 0 && coord2_2 % 2 == 0) {
			isBlack_2 = true;
		}

		if (isBlack_1 == isBlack_2) {
			System.out.println("Possitions with same colour");
		} else
			System.out.println("Possitions with different colour");

	}

}
