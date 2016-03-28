
import java.util.Arrays;
public class arrayRecursion {


		public static void main(String[] args) {
			
			int[] array = new int[5];
			fill(array);
			fillRecursive(array, 0);
			System.out.println(Arrays.toString(array));
		}
		
		static void fillRecursive(int[] masiv, int i) {
			if(i == masiv.length) {
				return;
			}
			masiv[i] = i;
			fillRecursive(masiv, i+1);
		}
		
		static void fill(int[] masiv) {
			
			for(int i = 0; i < masiv.length; i++) {
				masiv[i] = i;
			}
		}
	}
