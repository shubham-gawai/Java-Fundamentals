package JavaFundaPractice;

import java.util.Scanner;

public class matrixEleSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		int sum = 0;
		System.out.println("Enter elements of an array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
				

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + arr[i][j];
				
			}
			
			 
		}
		System.out.println("sum of array elements is :"+ sum);
		
	}
}
