package array;

public class StoreValueArrayToArray {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50,60,70,80,90,100};

		//print a[] array
		System.out.print("Array a[] = ");
		for(int x : a) {
			System.out.print(x+" ");
		}		

		//declare b[] array with same length of a[]
		int b[] = new int[a.length];

		//storing value of a[] to b[]
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];			
		}

		//print b[] array
		System.out.println();
		System.out.print("Array b[] = ");
		for(int y : b) {
			System.out.print(y+" ");
		}
	}

}
