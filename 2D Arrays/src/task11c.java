import java.util.Scanner;

public class task11c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("enter nummber of cols: ");
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

	static void func(int[][] arr) {
		int counter = 0;
		 for(int i=0; i<arr.length; i++) {
			 int j = 0;
			 int tempI = i;

			while (tempI >= 0 && j<arr[0].length) {
				arr[tempI--][j++] = ++counter;
			}
		}
		
		
		for(int j=1; j<arr[0].length; j++) {
			int tempJ = j;
			int tempI = arr.length-1;
			
			while(tempI >= 0 && tempJ<arr[0].length) {
				arr[tempI--][tempJ++] = ++counter;
				
			}
		}
	}

}
