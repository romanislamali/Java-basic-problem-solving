
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.print("Write any Intiger number: ");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		
		if(input % 2==0) {
			System.out.println(input +" is an Even number!!");
		}else {
			System.out.println(input +" is an Odd number!!");
		}

	}

}