package homework_Lesson28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text here: ");
		String text = sc.nextLine();
		
		text = text.toLowerCase();
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		int letterCounter = 0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				letterCounter++;
			if(map.containsKey(text.charAt(i))) {
				map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
			}
			else
			map.put(text.charAt(i), 1);
			}
			else continue;
		}
		
		ValueComparator vc = new ValueComparator(map);
		
		TreeMap<Character, Integer> newMap = new TreeMap<Character, Integer>(vc);
		newMap.putAll(map);
		
		System.out.println("\nNumber of all symbols: " + (text.length()-1));
		System.out.println("Number of letters: " + letterCounter + "\n");
		
		for(Map.Entry<Character, Integer> tempEntry: newMap.entrySet()) {
			double tempVar = 0;
			System.out.print(tempEntry.getKey() + " -> " + tempEntry.getValue() + "  ");
			tempVar = (double)100/(letterCounter/tempEntry.getValue());
			tempVar = (int) Math.round(tempVar);
			while(tempVar > 0) {
				System.out.print("*");  // '#' is for the weak
				tempVar--;
			}
			System.out.println();
		}
	}
}
