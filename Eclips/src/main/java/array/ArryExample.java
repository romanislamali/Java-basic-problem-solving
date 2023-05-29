package array;

public class ArryExample {

	public static void main(String[] args) {
		String arr[] = {"A", "B", "C", "D", "E"};
		double[] myList = new double[5];
		myList[0]= 10.5;
		myList[1]= 20.5;
		myList[2]= 30.5;
		myList[3]= 40.5;
		myList[4]= 50.5;
		for(String a: arr) {
			System.out.println(a);
		}
		System.out.println("***********************************");
		//reverse the array
		for(int i = myList.length-1; i >= 0; i--) {
			System.out.println(myList[i]);
		}
		
	}
}
