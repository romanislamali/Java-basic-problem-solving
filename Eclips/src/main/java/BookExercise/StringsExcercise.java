package BookExercise;

public class StringsExcercise {

	public static void main(String[] args) {
		// String value cann't be changed.
		// If you want to concat a value you need to declear a new variable.
		
//		String x = "abcde";
//		x="xxxxxx";
//		String y = x.concat("fghij");
//		System.out.println(x);
//		System.out.println(y);
		
		String s3 = "Value1";
		String s2 = "Value2";
		for (int i = 0; i < 10; ++i) {
		s3 = s3 + s2;
		System.out.println(s3);
		}


	}

}
