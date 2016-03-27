/*
   Starting from 3 to display the first n
numbers that are divisible by 3. The numbers are separated by commas
  */
  
package homework2;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter how many numbers which can be devided by 3 you want: ");
		int num = sc.nextInt();

		int counter = 0;
		int i = 3;
		while (counter < num) {
			if (counter == num - 1) {
				System.out.print(i);
				break;
			} else {
				System.out.print(i + ", ");
				i += 3;
				counter++;
			}
		}

	}

}
