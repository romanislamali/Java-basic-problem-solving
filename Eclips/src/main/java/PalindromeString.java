import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String []args) {
		
		// Take text from user to check palindrome
		System.out.print("Write any word for check Palindrome: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String  revStr = "";
		int strLength = str.length();
		
		for(int i = strLength - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		// Convert str and revStr to lower case and check to equality
		if(str.toLowerCase().equals(revStr.toLowerCase())) {
			System.out.println(str+" is a Palindrome!!");
		}else {
			System.out.println(str+" is not a Palindrome!!");
		}
		
	}

}
