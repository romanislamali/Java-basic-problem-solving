package recursion;

public class RecursionExample {

	public static void main(String[] args) {
		int result = sum(10);
		System.out.println("Sum of under of value: "+result);
		
		int resultOfRange = sumOfRange(0, 10);
		System.out.println("Sum of the range: "+resultOfRange);
	}
	
	//Sum of the input value
	public static int sum(int val) {
		if(val > 0) {			
			return val + sum(val - 1);
		}else {
			return 0;
		}
	}
	
	// Sum of the two input value range
	public static int sumOfRange(int start, int end) {
		if(start < end) {
			return end + sumOfRange(start, end - 1);
		}else {
			return end;
		}
	}

}
