package basicProblemSolving;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.print("Enter any integer number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int facto = 1;
		for(int i = 1; i <= input; i++) {
			facto *= i;
		}
		System.out.println("Factorial of "+input+" is "+facto);
	}
}
