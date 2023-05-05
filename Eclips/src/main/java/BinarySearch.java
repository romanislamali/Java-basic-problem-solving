import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int [] arr = {5,10,15,20,25,30,35};
		System.out.print("Enter any number having in \n arry for getting index no:");
		Scanner sc = new Scanner(System.in);
		int kye = sc.nextInt();
		int first = 0;
		int last = arr.length-1;

		binarySearch(arr, first, last, kye);
	}



	public static void binarySearch(int arr[], int first, int last, int kye) {
		int mid = (first + last)/2;
		while(first <= last) {
			if(kye > arr[mid]) {
				first = mid + 1;
			}else if(kye == arr[mid]){
				System.out.println("Element is found at index: " + mid);
				break;
			}
			else {
				last = mid - 1;			
			}
			mid = (first + last)/2;
		}
		if(first > last) {
			System.out.println("Element is not found!");  
		}	
	}
}
