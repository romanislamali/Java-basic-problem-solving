
public class SumOfArry {

	
	public static void main(String[] args) {
		arrySum();
		arryOfSum();

	}
	
	//Calculate sum of array using forEach loop
	public static void arrySum() {		
		int arr[] = {5, 10, 15, 20, 25};
		
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		System.out.println("Sum of the array: "+sum+" //using for each loop");
	}
	
	//Calculate sum of array using for loop
	public static void arryOfSum() {
		int arr[] = {5, 10, 15, 20, 25};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the array: "+sum+" //using for loop");
	}

}
