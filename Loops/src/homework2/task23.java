/*
  To draw up a program through the cycle while output
the multiplication table, but without repetition.
I.e. if 4 * 5 is displayed, it is not displayed 5 * 4.
  */
  
package homework2;

public class task23 {

	public static void main(String[] args) {

		byte a = 1;
		byte i = 1;
		byte b;		

		while (a <= 9) {
			b = i;
			while (b <= 9) {
					System.out.print(a + " * " + b + " = " + a*b + ", ");
				b++;
			}
			System.out.println();
			a++;
			i++;
		}

	}

}
