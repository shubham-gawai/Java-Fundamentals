	//write a program to convert day to second :
import java.util.Scanner;
public class timeConvert {
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			int days = sc.nextInt();
			
			int hour = 24*days;
			int min = hour*60;
			int sec = min*60;
			
			System.out.println(sec);
			
			
		}
}
	
	
	//we've defined Scanner class fisrt and then int :
