
public class StringExample {

	public static void main(String[] args) {
		
		//creating string by java string literal
		String s1 = "roman ";
		System.out.println(s1);
		char ch[]={'i','s','l','a','m'};
		
		//converting char array to string
		String s2 = new String(ch);
		System.out.println(s2);
		
		//creating java string by new keyword
		String s3 = new String("example");
		System.out.println(s3);
		
		//concat two string
		String x = s1.concat(s2);
		System.out.println(x);
		
		//trim string
		String trim = s1.trim();
		System.out.println(trim);
		
		String upper = trim.toUpperCase();
		System.out.println(upper);
		
		String lower = upper.toLowerCase();
		System.out.println(lower);
		
		String replace = lower.replace(lower, "ali");
		System.out.println(replace);
		
		boolean isEmpty = replace.isEmpty();
		System.out.println(isEmpty);
		
		boolean equals = trim.equals(lower);
		System.out.println(equals);
		
		String subString = lower.substring(1);
		System.out.println(subString);
	}

}
