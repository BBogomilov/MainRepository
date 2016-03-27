/*
 To make a program which guesses how cold / warm it is from the 
entered temperature t in degrees Celsius.
Temperature ranges are:
below -20 ice cold;
between 0 and -20 - cold;
15 to 0 - cool;
between 25 and 15 - hot;
over 25 - too hot.

 */

import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter temperature in Celsius from -100 to 100: ");
		byte temp = sc.nextByte();
		
		if(temp < -100 || temp > 100) {
			System.out.println("error: number not in the accurate interval");
			return;
		}
		
		if(temp < -20) {
			System.out.println("It's very cold!");
		}
		else if(temp >= -20 && temp < 0) {
			System.out.println("It's cold");
		}
		else if (temp >= 0 && temp < 15) {
			System.out.println("It's chilly");
		}
		else if (temp >= 15 && temp < 25) {
			System.out.println("It's warm :)");
		}
		else
			System.out.println("It's too hot :(");

	}

}
