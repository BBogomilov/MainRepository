/*
 To compile a program that from an introduced string, containing letters,
numbers, a minus sign '-' must print out the sum of the numbers entered by
account the sign '-' before the respective number.

 */

package homework5;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string with some numbers, separated by other symbols :)");
		String str = sc.nextLine();

		long sum = 0;
		int tempDigit;
		int tempNum = 0;
		boolean isNegative = false;

		for (int i = 0; i < str.length(); i++) {

			if (i < str.length()-1 && str.charAt(i) == '-' && (str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9')) {
				isNegative = true;                           // ��� ������ ����������� �����
			} 
			else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') { // ��� ��������� � �����
				
				if (i == 0 || (i != 0 && (str.charAt(i-1)<'0' || str.charAt(i-1)>'9'))) { //��� ������� � ���������� ���
					tempDigit = str.charAt(i) - 48;//�� ASCII ���������                    ����� � ���������� �����
					tempNum = tempDigit;
					
					if (i == str.length()-1 || (i != str.length()-1 && (str.charAt(i+1)<'0' || str.charAt(i+1)>'9'))) {
						if(isNegative) {
							tempNum *= (-1);
						}
						
					      System.out.println(tempNum);
						  sum += tempNum;
						  isNegative = false;
					}
				}
				else {                                 // ��� ������� � � ������� �� ������� ����� 
					tempDigit = str.charAt(i) - 48;    // (+ �������� ���� � �������� � �������)
					tempNum = tempNum*10 + tempDigit;
					if (i == str.length()-1 || (i != str.length()-1 && (str.charAt(i+1)<'0' || str.charAt(i+1)>'9'))) {
						if(isNegative) {
							tempNum *= (-1);
						}
						
						System.out.println(tempNum);
						sum += tempNum;
						isNegative = false;
					}

				}
			}
			
			else continue;
		}
		System.out.println("Sum of numbers in string: " + sum);
	}

}
