import java.util.Scanner;

public class task11d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter rows: ");
		int rows = sc.nextInt();
		System.out.println("enter cols: ");
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
		int counter=0;
		
		for(int j=0; j<arr[0].length; j++) {
			if(j%2 ==0) {
				for(int i=0; i<arr.length; i++) {
					arr[i][j] = ++counter;
				}
			}
				else {
					for(int i=arr.length-1; i>=0; i--) {
						arr[i][j] = ++counter;
					}
				}
			}
		}
	}