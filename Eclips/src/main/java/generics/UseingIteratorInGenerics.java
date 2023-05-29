package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class UseingIteratorInGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("Roman");
		ll.add("Islam");
		ll.add("Ali");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
