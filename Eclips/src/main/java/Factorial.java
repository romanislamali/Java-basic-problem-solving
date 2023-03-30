import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter an Intiger number: ");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		int res=1;
		
		for(int i=1; i<=input; i++) {
		  res =res * i;
			
		}
		
		System.out.println("Factorial of "+input+" is: "+res);

	}

}
