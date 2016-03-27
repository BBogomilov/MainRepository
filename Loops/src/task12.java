/*
 To compile a program that displays all
natural three-digit numbers that do not have the same digits :
100, 101, 606, etc. must not be displayed.
 */

package homework2;

public class task12 {

	public static void main(String[] args) {

		for (int i = 100; i < 999; i++) {
			if (i % 10 == (i / 10) % 10 || i % 10 == i / 100 || (i / 10) % 10 == i / 100) {
				continue;
			} else 
				System.out.print(i + ", ");
		}

	}

}
