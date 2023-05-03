
public class StoreValueArrayToArray {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};

		int b[] = new int[a.length];
		
		for(int x : a){
			System.out.print(x+" ");
			for(int i = 0; i <= a.length-1; i++) {
				b[i] = x;
			}
		}
		
		System.out.println();
		for(int y : b){
			System.out.print(y+" ");
		}
//		System.out.println(b[5]);
	}

}
