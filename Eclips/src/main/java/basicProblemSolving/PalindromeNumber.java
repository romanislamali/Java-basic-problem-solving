package basicProblemSolving;

public class PalindromeNumber {

	public static void main(String[] args) {

		int riminder, sum = 0, temp;    
		int number = 454;//It is the number variable to be checked for palindrome  

		temp = number;    
		while(number > 0){    
			riminder = number % 10;  //getting remainder  
			sum = (sum * 10) + riminder;    
			number = number/10;    
		}    
		if(temp == sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    

	}

}
