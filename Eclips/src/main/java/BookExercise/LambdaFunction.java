package BookExercise;

import java.util.ArrayList;

public class LambdaFunction {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(5);
		num.add(7);
		num.add(9);
		num.add(3);
		num.add(2);
		num.add(4);
		
		System.out.println(num);
		
		num.forEach(n -> {
			if (n%2 == 0) {
				System.out.println(n+" is an even number"); 
			}
			System.out.println(n+" is an odd number");
		});
		
		num.forEach(oneOfNum -> {
			System.out.println(oneOfNum);
		});

	}

}
