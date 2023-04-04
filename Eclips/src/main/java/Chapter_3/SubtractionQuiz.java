package Chapter_3;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		
		// Generate two random single-digit integers number
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		
		
		if(num1 < num2) {
			int temp = num2;
			num2=num1;
			num1=temp;	
		}
		System.out.println("Do the belew subtraction-");
		System.out.println("First number is "+num1);
		System.out.println("Second number is "+num2);
		System.out.print("Enter Your answer :");
		Scanner input = new Scanner(System.in);
		
		int answer = input.nextInt();
		
		if(num1 - num2 == answer) {
			System.out.println("Your answer is right!!");
		}
		else {
			System.out.println("Your answer is Wrong. Correct ans is :"+(num1-num2));
		}

	}

}
