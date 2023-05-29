package basicProblemSolving;

public class SwappingTwoVariableExceptThirdVariable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		b = a + b;
		a = b - a;
		System.out.println("a = "+a);
		
		b = b - a;
		System.out.println("b = "+b);

	}

}
