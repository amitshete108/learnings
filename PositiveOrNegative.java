package JAVA_CERTIFICATION;
import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		System.out.println("To check number positive or negative");
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number<0) {
			System.out.println("Entered number is Negative");
		}
		if(number>0) {
			System.out.println("Entered number is Positive");
		}
		if(number==0) {
			System.out.println("Entered Number is neither Positive nor Negative");
		}
		
		
	}

}
