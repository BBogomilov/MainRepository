/*
  An ordered deck of cards.
Ordinance severity of the card: 2,3,4,5,6,7,8,9,10, Jack, Queen,
King, Ace.
Ordinance on colored cards is: clubs, diamonds, hearts, spades.
To create a program that introduces N - number of
interval [1..51] and display the entered number card the
other larger cards from the deck.
  */
  
package homework2;

import java.util.Scanner;

public class task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		short num;
		do{
			System.out.println("enter a number between 1 and 52: ");
			num = sc.nextShort();
		} while (num < 1 || num > 52);
		
		switch(num) {
		
		case 1: System.out.print(2 + " clubs, ");
		case 2: System.out.print(2 + " diamond, ");
		case 3: System.out.print(2 + " hearts, ");
		case 4: System.out.print(2 + " spade, ");
		case 5: System.out.print(3 + " clubs, ");
		case 6: System.out.print(3 + " diamond, ");
		case 7: System.out.print(3 + " hearts, ");
		case 8: System.out.print(3 + " spade, ");
		case 9: System.out.print(4 + " clubs, ");
		case 10: System.out.print(4 + " diamond, ");
		case 11: System.out.print(4 + " hearts, ");
		case 12: System.out.print(4 + " spade, ");
		case 13: System.out.print(5 + " clubs, ");
		case 14: System.out.print(5 + " diamond, ");
		case 15: System.out.print(5 + " hearts, ");
		case 16: System.out.print(5 + " spade, ");
		case 17: System.out.print(6 + " clubs, ");
		case 18: System.out.print(6 + " diamond, ");
		case 19: System.out.print(6 + " hearts, ");
		case 20: System.out.print(6 + " spade, ");
		case 21: System.out.print(7 + " clubs, ");
		case 22: System.out.print(7 + " diamond, ");
		case 23: System.out.print(7 + " hearts, ");
		case 24: System.out.print(7 + " spade, ");
		case 25: System.out.print(8 + " clubs, ");
		case 26: System.out.print(8 + " diamond, ");
		case 27: System.out.print(8 + " hearts, ");
		case 28: System.out.print(8 + " spade, ");
		case 29: System.out.print(9 + " clubs, ");
		case 30: System.out.print(9 + " diamond, ");
		case 31: System.out.print(9 + " hearts, ");
		case 32: System.out.print(9 + " spade, ");
		case 33: System.out.print(10 + " clubs, ");
		case 34: System.out.print(10 + " diamond, ");
		case 35: System.out.print(10 + " hearts, ");
		case 36: System.out.print(10 + " spade, ");
		case 37: System.out.print("J" + " clubs, ");
		case 38: System.out.print("J" + " diamond, ");
		case 39: System.out.print("J" + " hearts, ");
		case 40: System.out.print("J" + " spade, ");
		case 41: System.out.print("Q" + " clubs, ");
		case 42: System.out.print("Q" + " diamond, ");
		case 43: System.out.print("Q" + " hearts, ");
		case 44: System.out.print("Q" + " spade, ");
		case 45: System.out.print("K" + " clubs, ");
		case 46: System.out.print("K" + " diamond, ");
		case 47: System.out.print("K" + " hearts, ");
		case 48: System.out.print("K" + " spade, ");
		case 49: System.out.print("A" + " clubs, ");
		case 50: System.out.print("A" + " diamond, ");
		case 51: System.out.print("A" + " hearts, ");
		case 52: System.out.print("A" + " spade.");
		} 
		
	}

}
