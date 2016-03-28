import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int rows;
		do {
		System.out.println("enter number of rows: ");
		rows = sc.nextInt();
		} while (rows < 2);
		
		int cols;
		do {
		System.out.println("enter number of columns: ");
		cols = sc.nextInt();
		} while (cols < 2);
		
		int[][] arr = new int[rows][cols];
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		int maxSum =0;
		
		for(int i=0; i<2; i++) {
			for (int j =0; j<2; j++) {
				maxSum += arr[i][j];
			}
		}
		
		int coord1 =0;
		int coord2=0;
		
		for(int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr[i].length-1; j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i][j+1] + arr[i+1][j+1];
				if(sum > maxSum) {
					maxSum = sum;
					coord1 = i;
					coord2 = j;
				}
				else continue;
				sum =0;
			}
		}
		
		System.out.println(); 
		
		for(int i = coord1; i <= coord1 + 1; i++) {
			for(int j = coord2; j <= coord2 + 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
