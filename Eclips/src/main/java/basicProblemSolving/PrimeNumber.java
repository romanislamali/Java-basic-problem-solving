package basicProblemSolving;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.print("Write a number: ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= input; i++) {
			if(input % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(input+" is a prime number!!");
		}else {
			System.out.println(input+" is not a prime number!!");
		}

	}

}
