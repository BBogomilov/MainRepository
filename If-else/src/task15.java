/*
To compile a program that recieves integer ranging from
[0..24].
The program gives adequate notice pursuant the given
hour.
Periods are:
[18..4] - Good evening;
[4..9] - Good morning;
[9..18] - Good afternoon
 */

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter time value from 0 to 24: ");
		byte time  = sc.nextByte();
		
		if(time < 0 || time > 24) {
			System.out.println("error: value not in the accurate interval");
			return;
		}
		
		if((time >= 18 && time <= 24) || (time >= 0 && time < 4)) {
			System.out.println("Good evening!");
		}
		else if (time >= 4 && time < 9) {
			System.out.println("Good morning!");
		}
		else
			System.out.println("Good afternoon!");

	}

}
