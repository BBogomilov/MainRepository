import java.util.Scanner;

public class task11b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("enter number of cols: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		func(arr);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	static void func (int[][] arr) {
		int counter = 1;
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[j][i] = counter++;
			}
		}
	}

}
