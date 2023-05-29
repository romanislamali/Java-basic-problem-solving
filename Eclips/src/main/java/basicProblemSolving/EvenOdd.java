package basicProblemSolving;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//		evenOddFromUserInput();
		evenOddFromArry();

	}

	//Calculating Even Odd by getting value from user
	static void evenOddFromUserInput() {
		System.out.print("Write any Intiger number: ");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();

		if(input % 2 == 0) {
			System.out.println(input +" is an Even number!!");
		}else {
			System.out.println(input +" is an Odd number!!");
		}

	}


	//Calculating Even Odd from array
	static void evenOddFromArry() {
		int arr[] = {1, 5, 12, 4, 5, 19, 7, 8, 9};

		//Using forEach loop
		for(int a : arr) {
			if(a % 2 == 0) {
				System.out.println(a+" is an Even number!!");
			}else {
				System.out.println(a+" is an Odd number!!");
			}			
		}

		System.out.println("********************************");

		// Using for loop
		for(int i = 0; i< arr.length; i++) {

			if(arr[i] % 2 == 0){
				System.out.println(arr[i]+" is an Even number!!");
			}else {
				System.out.println(arr[i]+" is an Odd number!!");
			}

		}
	}
}