package array;

import java.util.Scanner;

public class IndexCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] data = { 10, 26, 34, 67, 91, 101, 32, 87, 45 };
		int n = data.length;

		System.out.println("Enter value searching for :");
		int d = sc.nextInt();

		boolean isFound = false;

		for (int i = 0; i < n; i++) {
			
			if (data[i] == d) {

				isFound = true;
			}
		} 
		for (int i = 0; i < n; i++) {
			d=i;
			if (isFound == true) {
				System.out.println("Found at " + i);
				break;
			} else {
				System.out.println("Not found");
				break;
			}
		}
	}
}
