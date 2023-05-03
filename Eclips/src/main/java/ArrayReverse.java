
public class ArrayReverse {

	public static void main(String[] args) {

		arrayReverse();

	}

	static void arrayReverse() {

		int arr[] = {25, 2, 3, 4, 5};
		
		//Print of array
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Print of reverse of array
		System.out.println();
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}		
	}

}
