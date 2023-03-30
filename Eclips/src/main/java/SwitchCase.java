import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch (input) {
		case 0:
			System.out.println("This is zero");
			break;
		case 1:
			System.out.println("This is one");
			break;
		case 2:
			System.out.println("This is two");
			break;
		case 3:
			System.out.println("This is three");
			break;
		case 4:
			System.out.println("This is four");
			break;

		default:
			System.out.println("This is default value!!");
			break;
		}

	}

}
