
/*
 Enter 3 variables from the keyboard - hour (integer) Amount
money (float), if I'm healthy - boolean.
Write a program that makes decisions based on these data
follows:
  - If I'm sick, I will not go out
  - If I have money, I will buy drugs
  - If I do not - I'll stay home and drink tea
  - If I'm healthy, I'll go to the movies with friends
  - If I have less than 10 levs, I'll go for coffee.

 */

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//System.out.println("enter hour: ");   --> ненужна променлива ?
		//byte time = sc.nextByte(); 

		System.out.println("enter money: ");
		float levs = sc.nextFloat();

		//System.out.println("are you healthy? (type '1' for Yes and '0' for No)");    --> не може да се въведе от клавиатурата
		boolean healthy = false;

		if (!healthy) {
			System.out.println("I won't go out.");

			if (levs > 0) {
				System.out.println("I will buy myself medicines.");
			} else {
				System.out.println("I will stay at home and drink hot tea.");
			}
		}

		else {
			if(levs >= 10)
			System.out.println("I will go to the cinema with friends.");

			else
				System.out.println("I wil go to the caffe.");
			
		}
	}

}
