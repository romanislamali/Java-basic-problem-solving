import java.util.Arrays;
import java.util.Random;

public class randSwapping {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		Random rand = new Random();
		
		for(int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			System.out.println(randomIndexToSwap);
			int temp = array[randomIndexToSwap];
			System.out.println("temp: "+temp);
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}		
		System.out.println(Arrays.toString(array));
	}

}
