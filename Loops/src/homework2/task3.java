/*
  To display the all odd numbers from 10 to 10
  */
  
package homework2;

public class task3 {

	public static void main(String[] args) {
		
		for(int i = -10; i <= 10; i++) {
			if(i%2 == 0) {
				continue;
			}
			else System.out.print(i + " ");
		}

	}

}
