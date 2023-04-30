package BookExercise;

public class StringBufferExercise {

	public static void main(String[] args) {
		
		String st = "Roman";
		
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb);
		
		sb.append(" Islam Ali");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.replace(0, 20, "Beautiful");
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
	}

}
