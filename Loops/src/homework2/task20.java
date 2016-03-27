/*
  To compile a program that displays a square of
digits. The amounts of the elements of any row or column are
equal to 45.
  */
  
package homework2;

public class task20 {

	public static void main(String[] args) {

		int counter = 0;
		byte k = 0;
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				
					System.out.print(counter + " ");
					
					if(counter == 9) {
						counter = -1;
					}
					counter++;
			}
			k++;
			System.out.println();
			counter = 0 + k;
		}

	}

}
