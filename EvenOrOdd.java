package JAVA_CERTIFICATION;
import java.util.*;

//Changes for Test branch
public class EvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("To find number even or odd");
		System.out.println();
		System.out.println("Please Enter the Number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=a%2;
		
		if(b==0) {
			System.out.println("Entered Number is Even");
			}
		else {
			System.out.println("Entered Number is Odd");
		}
	}

}
