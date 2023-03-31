package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		
		st.push("Roman");
		st.push("Tajnur");
		st.push("Ehsan");
		st.push("Sajib");
		st.push("Rashed");
		st.push("Farjana");
		st.push("Istiaque");
		
		st.pop();
		
		Iterator<String> itr = st.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
