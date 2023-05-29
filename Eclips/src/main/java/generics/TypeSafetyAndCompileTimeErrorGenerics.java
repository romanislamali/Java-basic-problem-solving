package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyAndCompileTimeErrorGenerics {

	public static void main(String[] args) {
		
		//Without generic
		List l1 = new ArrayList();
		l1.add(5);
		l1.add("Roman");	
		l1.add(true);
		System.out.println("This array is without generic"+l1);
		
		//With generic
		List<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(10);
//		If we can try use blew 2 add methods, it's check type and provide compile time error
//		because of this List is a Integer type generic, it can't take any others type
		//l2.add(5.2);
		//l2.add("Roman");

	}

}
