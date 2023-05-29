package basicProblemSolving;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("Enter any number for get fibonacci series : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int fibo;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" "+n2);
		for(int i = 2; i <= input; i++) {
			fibo = n1 + n2;
			System.out.print(" "+fibo);
			n1 = n2;
			n2 = fibo;
		}

	}

}
