
public class RecursionExample {

	public static void main(String[] args) {
		int result = sum(15);
		System.out.println(result);
		
		int resultOfRange = sumOfRange(5, 10);
		System.out.println(resultOfRange);
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
