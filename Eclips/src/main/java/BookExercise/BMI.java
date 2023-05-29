package BookExercise;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight in pounds
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble();
		
		// Prompt the user to enter height in inches
		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237; //CONSTANT VALUE
		final double METERS_PER_INCH = 0.0254; //CONSTANT VALUE
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Display result
		System.out.println("BMI is "+bmi);		
		if(bmi < 18.5) {
			System.out.println("Under weight");
		}
		else if(bmi < 25) {
			System.out.println("Normal");
		}
		else if(bmi < 30) {
			System.out.println("Over weight");
		}
		else {
			System.out.println("Obese");
		}			
	}
}
